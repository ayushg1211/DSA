package dsa.strings;

public class Capitalize1stCharOfEachWord {
	public static void main(String[] args) {
		String str = "a e i o" ;
		
		int st = 0 ;
		int end = 0;
		String str2  = "" ;
		if(str.length()==0) {
			System.out.println("Empty String");
			return ;
		}
		
		while(end < str.length()) {

			if(str.charAt(end) == ' ') {
				str2 += str.charAt(end) ;
			}
			else {
				char ch =  str.charAt(end);
				if(end == 0) {
					ch = (char)(str.charAt(end) - 'a' + 'A') ;
				}
				else if(str.charAt(end-1) == ' ' && ch != ' ') {
					if(str.charAt(end) >= 'a' && str.charAt(end) <= 'z') {
						ch = (char)(str.charAt(end) - 'a' + 'A') ;
					}
				}
				str2 += ch ;
			}
			end++ ;
		}

		System.out.println(str2);
	}
}
