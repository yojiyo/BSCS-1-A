package exercise2C;

import java.util.Scanner;

public class Exercise2C {

	public static void main(String[] args) {

		int i, j, ctr = 0, ctr2 = 0;
		
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
			i = in.nextInt();
			
		System.out.println("Enter another number");	
		Scanner in2 = new Scanner(System.in);
			j = in2.nextInt();		
			
		for (ctr = 1; ctr <= j; ctr++) {
			for (ctr2 = 1; ctr2 <= i; ctr2++) {
				System.out.print((ctr * ctr2) + " ");
			}
			System.out.println();
		}
	}
}

