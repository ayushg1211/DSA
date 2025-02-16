package dsa.recursion;

import java.util.Scanner;

public class PowerLinear {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		int x = scn.nextInt();
		int n = scn.nextInt() ;
		
		System.out.println(pL(x, n) );
		System.out.println(pLLog(x, n) );
	}
	
	public static int pL(int x, int n) {
		if(n==0) {
			return 1 ;
		}
		
		x = x * pL(x, n-1) ;
		return x ;
	}
	
	public static int pLLog(int x, int n) {
		if(n==0) {
			return 1 ;
		}
		
		int ans = pLLog(x, n/2); ;
		
		if(n%2 == 0) {
			x = ans*ans ;
		}
		else {
			x = ans*ans*x;
		}
		
		return x ;
	}
}
