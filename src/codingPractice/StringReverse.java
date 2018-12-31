package codingPractice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		//BIRINCI YOL
		
	    String original;
		String reverse = "" ;
		
		
		
		System.out.println("Bir kelime giriniz");
		
		Scanner sc = new Scanner(System.in);
		
		original = sc.next();
		
//		int len = original.length();
//	
//		for (int i = len-1 ; i >= 0; i--  ) 
//			reverse = reverse + original.charAt(i);
//			System.out.println("Kelimenin tersi :"+ reverse);
//	
		
		// IKINCI YOL
		
		StringBuffer sb = new StringBuffer(original);
		reverse = sb.reverse().toString();
		
		System.out.println("Kelimenin tersi :"+ reverse);
		
		
		
		
	}

}
