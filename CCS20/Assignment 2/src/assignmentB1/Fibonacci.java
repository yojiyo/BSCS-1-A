package assignmentB1;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args){
		
		int n, num1 = 0, num2 = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the nth term to check its Fibonacci sequence");
			n = in.nextInt();
			
		System.out.println("Fibonacci Sequence:");
		
		for(int i = 1; i <= n ; i++){
			System.out.print(num1 + ", ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
	}
}
