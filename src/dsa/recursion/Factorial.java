package dsa.recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		int n = scn.nextInt() ;
		
		int f = fact(n) ;
		System.out.println(f) ;
	}
	
	public static int fact(int n) {
		if(n==0) {
			return 1 ;
		}
		
		int f= n * fact(n-1) ;
		
		return f ;
	}
}
