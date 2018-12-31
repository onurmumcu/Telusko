package codingPractice;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		System.out.println("Input a number");
		
		Scanner sc =new Scanner(System.in);
		int i = sc.nextInt();
		
		if (i %2==0) {
			System.out.println("Even Number");
			
		}else 
			System.out.println("Odd Number");
	}

}
