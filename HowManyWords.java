package dataStructure;

import java.util.*;
public class HowManyWords {
	
	static int countWord(String s) {
	//	s.replace('.', '');
		
		String[] words = s.split(" ");
		return words.length;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		System.out.println(countWord(s));
	}

}
