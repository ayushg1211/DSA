package dsa.strings;

public class PrintSumOfAllNumericCharactersInString {
	public static void main(String[] args) {
		String str = "ayush goel 4091 @786 namaste21drtcytgrbf43ctg5g789g03fg9";
		
		int sum = 0 ;
		
		for(int i=0 ; i<str.length() ; i++) {
			char ch = str.charAt(i) ;
			if(ch >= '0' && ch <='9') {
				int num = ch - 48 ;
				if(num%2 == 0) {
					sum += ch - 48 ;
				}
				
			}
		}
		System.out.println(sum);
	}
}
