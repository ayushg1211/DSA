package dsa.strings;

import java.util.Scanner;

public class PrintOnlyUniqueCharacters {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		String str = scn.nextLine();
		int max = 1;
		char mx= '0' ;
		
		for(int i=0 ; i<str.length() ; i++) {
			char ch = str.charAt(i) ;
			boolean unique  = true ;
			int count=1;
			for(int j=0 ; j< i; j++) {
				if(ch == str.charAt(j)) {
					unique = false ;
					break ;
				}
			}
			
			if(unique) {
				boolean un = true ;
				for(int k = i+1 ; k<str.length() ; k++) {
					if(ch == str.charAt(k)) {
						count++ ;
						un = false ;
//						break; 
					}
				}
				
				if(!un) {
					if(count >= max) {
						max=count ;
						mx = ch ;
					}
				}
				
				if(un) {
					System.out.println(ch);
				}
			}
		}
		System.out.println(mx + "  :- " + max);
	}
}
