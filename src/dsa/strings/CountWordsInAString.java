package dsa.strings;

import java.util.Scanner;

public class CountWordsInAString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		String str = scn.nextLine() ;
		
		int count = getCount(str) ;
		System.out.println(count);
	}
	
	public static int getCount(String str) {
		int count=0 ;
		
		int st = 0 ;
		int end =st ;
		
		while(st < str.length() && end < str.length()) {
//			char ch =  ;
			if(str.charAt(st) == ' ') {
				st++ ;
				end = st ;
			}
			else if(str.charAt(end) != ' ') {
				end++ ;
			}
			else if(str.charAt(end) == ' ') {
				end-- ;
				count++ ;
				st = end+1 ;
			}
		}
		
		if(str.charAt(end-1) != ' ') {
			count++ ;
		}
		
		return count ;
	}
}
