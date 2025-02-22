package dsa.strings;

import java.util.Scanner;

public class PrintMissingDigit {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in) ;
//		
//		String st = scn.nextLine();
//		int[] a = new int[st.length()] ;
//		
//		for(int i=0 ; i<st.length() ; i++) {
//			
//		}
		
		String s1="*ab25cde@40de&8cd1#24dd";
		String[] arr=s1.split("[a-zA-Z0-9]+");
		System.out.println("length is: "+arr.length);
		for(String s:arr)
			System.out.println(s);
	}
}
