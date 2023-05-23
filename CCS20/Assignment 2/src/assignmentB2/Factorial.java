package assignmentB2;
import java.util.Scanner;
public class Factorial{

	public static void main(String[] args){
		
		int i, n, factor=1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to get its factorial");
			n = in.nextInt();
				
		for(i=1; i<=n; i++){    
			factor=factor*i;    
		  }    
		System.out.println("The factorial of " + n + " is " + factor);    
	}  
}  