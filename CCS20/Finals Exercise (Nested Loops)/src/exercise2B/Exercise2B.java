package exercise2B;

import java.util.Scanner;

public class Exercise2B {

	public static void main(String[] args) {

		int i, i2, ctr, ctr2;
		
		System.out.println("Enter a starting value.");
		Scanner in = new Scanner(System.in);
			i = in.nextInt();
			
		System.out.println("Enter an ending value.");	
		
		do {
			Scanner in2 = new Scanner(System.in);
			i2 = in2.nextInt();		
			if (i2 > i) {
				System.out.println("Invalid. Please enter a number lower than the starting value.");
			}
			else {
				System.out.println("Result:");
			}
		} while (i2 > i);
		
		for (ctr = i; ctr >= i2; ctr--) {
			for (ctr2 = 1; ctr2 <= (-1 * ctr + i); ctr2++) {
				System.out.print(".");
			}
			System.out.print(ctr);
			for (ctr2 = 1; ctr2 <= (ctr - i2); ctr2++) {
				System.out.print(".");
			}
			System.out.println();
		}
	}
}

