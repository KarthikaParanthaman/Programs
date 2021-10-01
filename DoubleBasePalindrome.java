package dataStructure;
import java.util.*;
public class DoubleBasePalindrome {
	static class PalindromeNumber {
		int decimal;
		String binary;
		boolean isPalindrome;
		
		PalindromeNumber(int n){
			decimal = n;
			binary = getBinary(n);
		}
		
		String getBinary(int n) {
			String b="";
			while(n>0) {
				int r = n%2;
				n = n/2;
				b = String.valueOf(r) + b ;
			}
			return b;
		}
		
		// for string
		boolean palindrome(String s) {
			int len = s.length();
			int j = len -1;
			for(int i = 0; i < (len/2); i++ ) {
				if(s.charAt(i) == s.charAt(j)) {
					j--;
					continue;
				} else {
					return false;
				}					
			}
			return true;
		}
		
		//for int
		boolean palindrome(int n) {
			int reverse = 0;
			int num = n;
			
			// for single digit
			if((num/10) == 0)
				return true;
			
			while(num > 0) {
				int r = num%10;
				reverse = (reverse * 10) + r; 
				num = num/10;
			}
			if(n == reverse)
				return true;
			return false;
		}
		
		boolean checkPalindrome() {
			boolean flag = false;
			if(palindrome(decimal)) {
				//System.out.println(decimal +" is Palindrome");
				if(palindrome(binary)) {
					//System.out.print(binary + " is plaindrome");
					flag = true;
				} 
			}
			return flag;
		}

	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			PalindromeNumber number = new PalindromeNumber(i);
			
			
			if(number.checkPalindrome()) {
				System.out.println(number.decimal + " " + number.binary );
				sum += number.decimal;
			}
			
		}
		System.out.println(sum);
	}
}
