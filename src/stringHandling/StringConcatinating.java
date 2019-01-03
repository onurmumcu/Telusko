package stringHandling;

import java.util.Scanner;

public class StringConcatinating {

	public static void main(String[] args) {

		String str1,str2;
		
		System.out.println("iki kelime giriniz");
		Scanner sc = new Scanner(System.in);
		
		str1 = sc.next();
		str2 = sc.next();
		
		String str3 = str1.concat(str2);  // veya bu sekilde yaparsin --> String str3 =str1 + str2;
		
		System.out.println("Birlesik kelime : " + str3);
	} 

}
