package dsa.strings;

public class ReverseEachWordOfAString {
	public static void main(String[] args) {
		String str = "I Love Java Programmin" ;
//		o/p => "I evoL avaJ gnimmargorp"
		String str2 = "" ;
		int st = 0 ;
		int end = st+1 ;
		int ePoint = st ;
		
		while(end < str.length()) {
			char ch = str.charAt(st) ;
			char endCh = str.charAt(end) ;
			if(ch == ' ') {
				str2 += ch ; 
				st++ ;
				end= st+ 1 ;
			}
			else {
				if(endCh != ' ') {
					end++ ;
				}
				else {
					str2 += endCh;
					ePoint = end-1 ;
					str2 += reverse(str, st, ePoint) ;
					st = end+1 ;
					end = st+1 ;
				}
			}
		}
		if(end == str.length()) {
			
			str2 += ' ' + reverse(str, st, end-1) ;
		}
		System.out.println(str2);
	}
	
	public static String reverse(String str, int st, int ePoint) {
		String strr = "" ;
		for(int i=ePoint ; i>= st ; i-- ) {
			strr += str.charAt(i); 
		}
//		System.out.println(strr);
		return strr ;
	}
}
