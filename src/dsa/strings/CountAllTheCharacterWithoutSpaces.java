package dsa.strings;

import java.util.Scanner;

public class CountAllTheCharacterWithoutSpaces {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		
		String str = scn.nextLine() ;
		
		System.out.println("Total no. of Characters without spaces are:- " + getCount(str));
	}
	
	public static int getCount(String s) {
		int count = 0 ;
		for(int i=0 ; i<s.length(); i++) {
			if(s.charAt(i) != ' ') {
				count++ ;
			}
		}
		return count ;
	}
}
