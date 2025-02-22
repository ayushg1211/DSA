package dsa.strings;

import java.util.Scanner;

public class PrintEachCharacterOnce {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		String str = scn.nextLine() ;
		
		printUnique(str) ;
	}
	
	public static void printUnique(String str) {
		System.out.print(str.charAt(0)+ " ");
		
		for(int i=1 ; i< str.length() ; i++) {
			char ch = str.charAt(i) ;
			boolean unique = true ;
			for(int j=0 ; j< i ; j++) {
				if(ch == str.charAt(j)) {
					unique = false ;
					break ;
				}
			}
			if(unique) {
				System.out.print(ch+" ");
			}
		}
	}
}
