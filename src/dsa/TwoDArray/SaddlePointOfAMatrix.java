package dsa.TwoDArray;

import java.util.Scanner;

public class SaddlePointOfAMatrix {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		int n = scn.nextInt();
		int[][] mat = new int[n][n] ;
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				mat[i][j] = scn.nextInt();
			}
		}
		
		int idx1=0, idx2 = 0 ;
		
		for(int i=0 ; i<n ; i++) {
			
			int min=Integer.MAX_VALUE ;
			
			for(int j=0 ; j<n ; j++) {
				if(min > mat[i][j]) {
					idx1 = i;
					idx2 = j ;
					min = mat[i][j] ;
				}
			}
			
			boolean check = true ;
			for(int k=0 ; k<n ; k++) {
				if(mat[k][idx2] >= mat[k][idx2]) {
					check = false ;
					break ;
				}
			}
			
			if(check == true){
				break ;
			}
		}
		
	}
}
