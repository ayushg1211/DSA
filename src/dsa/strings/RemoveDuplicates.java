package dsa.strings;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str = "aabcghfcbsfyrwirolvjg hryfhfdvl gdfsofsdfjsdfslfw hdfjkdfsjdw" ;
		String str2 = removeDup(str) ;
		String dup = removeDup2(str) ;

		System.out.println(str2);
		System.out.println(dup);
	}
	
	
	public static String removeDup(String str) {
		String str2 ="";
		str2 += str.charAt(0) ;
		
		for(int i=1 ; i<str.length() ; i++) {
			boolean check = false ;
			for(int j=0 ; j<str2.length(); j++) {
				if(str2.charAt(j) == str.charAt(i)) {
					check = true ;
					break ;
				}
			}
			if(!check) {
				str2 += str.charAt(i) ; 
			}
		}
		
		return str2 ;
		
	}
	
	public static String removeDup2(String str) {
		StringBuilder str2 = new StringBuilder(str);
		
		
		for(int i=0 ; i<str2.length()-1 ; i++) {
			boolean check = false ;
			for(int j=i+1 ; j<str2.length(); j++) {
				if(str2.charAt(j) == str2.charAt(i)) {
					str2.deleteCharAt(j) ;
					j=j-1 ;
				}
			}
		}
		
		return str2.toString() ;
		
	}
}
