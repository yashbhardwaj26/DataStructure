package Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 4 ; 
		char [] [] a = new char [n][n];
		
		for(int i = 0 ; i < n ; i++) {
			
			for (int j =0; j<n ;j++) {
				
				a[i][j]= '.';
			}
		}
		List<List <String>> l = new ArrayList<>();
		nQueen(0,a,l);
		
	}
	
	public static void nQueen(int col, char [] []a,List<List <String>> l) {
		
		if (col==a.length) {
			l.add(extracted(a));
	        int i = 1;
	        for (List < String > it: l) {
	            System.out.println("Arrangement " + i);
	            for (String s: it) {
	                System.out.println(s);
	            }
	            System.out.println();
	            i += 1;
	        }

			return;
			
			
			

	}

		
		for(int row = 0 ; row < a.length; row++) {
			
			if(validate(a,row,col)) {
				
				a[row][col] = 'Q';
				nQueen(col+1,a, l);
				a[row][col] = '.';
			
			}
		}
	
	}

	private static List<String> extracted(char[][] a) {
		List l1 = new LinkedList();
		
		for (int i = 0; i<a.length;i++) {
			String s = new String (a[i]);
			l1.add(s);
		}
		return l1;
	}

	private static boolean validate(char[][] a, int row, int col) {
		
		int duprow = row;
		int dupcol = col;
		
		while(row>=0 && col>=0) {
			
			if (a[row][col] == 'Q') return false;
			row--;
			col--;
		}
		
		row = duprow;
		col= dupcol;
		
		while (col>=0) {
			if (a[row][col] == 'Q') return false;
			col--;
			
		}
		
		row= duprow;
		col=dupcol;
		while (col>=0 && row < a.length) {
			
			if (a[row][col] == 'Q') return false;
			col--;
			row++;
			
		}
		
		return true;
	}

}
