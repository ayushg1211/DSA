package dsa.test_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingBits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		int n = scn.nextInt() ;
		List<Integer> bitList= getBits(n) ;
		
		for(int i : bitList) {
			System.out.println(i);
		}
	} 
	
	public static List<Integer> getBits(int n){
		List<Integer> bitList = new ArrayList<Integer>() ;
		int k=0 ;
		int temp = n ;
		int count = 0 ;

		while(n!=0) {
			k++ ;
			n/=2 ;
		}
		while(temp!= 0) {
			
			int rem = temp%2 ;
			if(rem == 1) {
				bitList.addFirst(k); 
				count++ ;
			}
			temp = temp/2 ;
			k-- ;
		}

		bitList.addFirst(count);
		return bitList ;
	}
}
