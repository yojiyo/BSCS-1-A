import java.util.Scanner;

public class Assignment2{

	public static void main(String[] args) {
		
		char operator;
		int num1, num2, result;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Select an operator: +, -, *, /, %");
		operator = in.next().charAt(0);
		
		System.out.println("Enter num1");
		num1 = in.nextInt();
		
		System.out.println("Enter num2");
		num2 = in.nextInt();
	
		switch (operator){
			
		case '+':
			System.out.println("Sum: " + (num1 + num2));
			break;
		case '-':
			System.out.println("Difference: " + (num1 - num2));
			break;
		case '*':
			System.out.println("Product: " + (num1 * num2));
			break;
		case '/':
			System.out.println("Quotient: " + (num1 / num2));
			break;
		case '%':
			System.out.println("Modulo: " + (num1 % num2));
			break;
		}
	}
}