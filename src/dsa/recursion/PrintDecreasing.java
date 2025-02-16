package dsa.recursion;

import java.util.Scanner;

public class PrintDecreasing {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		int n = scn.nextInt() ;
		printD(n) ;
	}
	
	public static void printD(int n) {
		if(n==0){
			return ;
		}
		System.out.println(n);
		printD(n-1) ;
	}
}
