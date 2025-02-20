package dsa.strings;

import java.util.Scanner;

public class SizeOfStrings4Ways {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		String s = scn.nextLine() ;
 		System.out.println(size1(s));
 		System.out.println(size2(s));
 		System.out.println(size3(s));
		
	}
	
	public static int size1(String str) {
		int count = 0 ;
		for(int i=0 ; i<str.length(); i++) {
			count++ ;
		}
		return count ;
	}

	public static int size2(String str) {
		str = str+ "\0" ;
		
		return str.indexOf('\0') ;
		
	}

	public static int size3(String str) {
		char[] arr = str.toCharArray() ;
		return arr.length ;
	}

	public static int size4(String str) {
		int count = 0 ; 
		str = str+ "\0" ;
		
		while(str.charAt(count) != '\0') {
			if(str.charAt(count) != '\0') {
				count++ ;
			}
		}
		return count ;
	}
}
