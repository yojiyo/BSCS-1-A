package exercise2A;

import java.util.Scanner;

public class Exercise2A {

	public static void main(String[] args) {

		int i, j, ctr, ctr2;
		
		System.out.println("Enter a starting value");
		Scanner in = new Scanner(System.in);
			i = in.nextInt();
			
		System.out.println("Enter and ending value");	
		
		do {
			Scanner in2 = new Scanner(System.in);
				j = in2.nextInt();		
			if (j < i) {
				System.out.println("Invalid. Please enter a number higher than the starting value.");
			}
			else {
				System.out.println("Result:");
			}
		} while (j < i);
		
		for (ctr = i; ctr <= j; ctr++) {
			for (ctr2 = 1; ctr2 <= ctr; ctr2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
