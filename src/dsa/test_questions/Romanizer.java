package dsa.test_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Romanizer {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		
		int[] arr = {56,87, 97, 11, 995, 548, 842, 777, 999} ;
		
		List<String> roman = getRoman(arr) ;
		for(String s : roman) {
			System.out.println(s);
		}
	}
	
	public static List<String> getRoman(int[] arabic) {
		String[] rNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"} ;
		int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		List<String> romans = new ArrayList<>() ;
		
		for(int i=0 ; i<arabic.length ; i++) {
			int num = arabic[i] ;
			StringBuilder sb = new StringBuilder() ;
			for(int j=0 ; j<vals.length ; j++) {
				while(num >= vals[j]) {
					sb.append(rNumerals[j]) ;
					num -= vals[j] ;
				}
			}
			romans.add(sb.toString()) ;
		}
		return romans ;
	}
}
