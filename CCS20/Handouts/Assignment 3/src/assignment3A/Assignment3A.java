package assignment3A;
import java.util.Scanner;
public class Assignment3A {

	public static void main(String[] args) {
		int i = 1, n, r = 9, a;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number");
			n = in.nextInt();
	
		while (i <= n) {
			a = (i * i) * r;
			System.out.print(a + " ");
			i++;
		}
		
	}

}