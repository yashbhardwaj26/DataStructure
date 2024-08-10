package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueenWithHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4; 
		
		char [][] a = new char [n][n];
		
		for (int i =0; i < n ; i++) {
			
			for (int j =0 ; j<n;j++) {
				
				a [i][j]= '.';
			}
		}
		
		int [] row1 = new int [n];
		int [] lowerDiagnol = new int [2*n-1];
		int [] upperDiagnol = new int [2*n-1];
		int column = 0 ;
		List <List <String>> l = new ArrayList<>();
		nQueen(column,a, row1,upperDiagnol,lowerDiagnol,l);
		

	}

	private static void nQueen(int column, char[][] a, int[] row1, int[] upperDiagnol, int[] lowerDiagnol,List l) {
		
		if (column ==a.length) {
			List<String> l1 = new ArrayList<>();
			for(int i =0;i< a.length;i++) {
				String s = new String(a[i]);
				l1.add(s);
			}
			l.add(l1);
			System.out.println(l);
			
			return;
			
		}
		
		for (int row =0; row< a.length;row++) {
			
			if(row1[row]==0 && lowerDiagnol[row+column]==0 && upperDiagnol[a.length-1 + column-row]==0) {
				
				a[row][column]= 'Q';
				row1[row]=1;
				lowerDiagnol[row+column]=1;
				upperDiagnol[a.length-1+column-row]=1;
				nQueen(column+1,a, row1,upperDiagnol,lowerDiagnol, l);
				a[row][column]= '.';
				row1[row]=0;
				lowerDiagnol[row+column]=0;
				upperDiagnol[a.length-1+column-row]=0;
			}
			
		}
	}

}
