package assignment3B;
import java.util.Scanner;
public class Assignment3B {

	public static void main(String[] args) {
		int n = 0, a = 0, b = 1;
		
		System.out.println("Input numbers");
		System.out.println("Enter -1 to end");
		
		do {
			Scanner in = new Scanner(System.in);
				n = in.nextInt(); 
			if (n == -1) {
				break;
			}
			else if (n % 2 == 0) {
				a += n;
			}
			else {
				b *= n;
			}
		} while (n != -1);
		
		System.out.println("Sum of all even numbers = " + a);
		System.out.println("Product of all odd numbers = " + b);
	}

}