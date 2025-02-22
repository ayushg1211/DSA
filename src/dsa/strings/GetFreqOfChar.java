package dsa.strings;

import java.util.Scanner;

public class GetFreqOfChar {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		String str = scn.nextLine() ;
		
		for(int i= 0 ; i<str.length(); i++) {
			int count= 0; 
			boolean unique = true ;
			for(int j= 0 ;j<i ; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					unique = false;
					break ;
				}
			}
			
			if(unique) {
				for(int k=i ; k<str.length() ; k++) {
					if(str.charAt(i) == str.charAt(k)) {
						count++ ;
					}
				}
				System.out.println(str.charAt(i) + " :- " + count);
			}
		}
	}
}
