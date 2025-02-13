package dsa.strings;

public class CountAllCharactersInAString {
	public static void main(String[] args) {
		String str = "Namaste@ 43z!@#(*f55#)ho#r oy%  40914#%09$8&NjjfgdffgsdgVVG" ;
		String str2 ="";
		StringBuilder sb = new StringBuilder(str) ;
		int count = 0 ;
		
		for(int i=0 ; i<sb.length() ; i++) {
			
			char ch = str.charAt(i);
			
			if(ch == ' ') {
//				str = str.replace(ch, '_') ;
				sb.setCharAt(i, '_'); 
//				str2 = str2+ '_';
			}
			else {
				str2 += ch ;
			}
			
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch>='0' && ch<='9')) {
				count++ ;
			}
			

		}
		System.out.println(count);
		System.out.println(str2);
		System.out.println(sb);
	}
}
