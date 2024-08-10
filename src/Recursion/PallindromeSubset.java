package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PallindromeSubset {
	
	public static void main(String [] args) {
		// TODO Auto-generated method stub

	
	
	String s = "aabb";
	
	List<String> l = new ArrayList<>();
	List <List<String>> res = new ArrayList<>();
	pallindromeSubset(0,s,l,res);
	}

	private static void pallindromeSubset(int index, String s, List<String> l, List<List<String>> res) {
		// TODO Auto-generated method stub
		
		if(index == s.length()) {
			res.add(new ArrayList<String>(l));
			System.out.println(res.toString());
			return;
		}
		
		for (int i = index ; i < s.length(); i++) {
			
			if (isPalindrome(index,i,s)) {
				
				l.add(s.substring(index,i+1));
				pallindromeSubset(i+1,s,l,res);
				l.remove(l.size()-1);
			}
		}
		
	}

	private static boolean isPalindrome(int begin, int last, String s) {
		// TODO Auto-generated method stub
		
		while (begin<=last ) {
			if (s.charAt(begin++) != s.charAt(last--)) {
				return false;
			}
			
		}
		return true;
	}
	

}
