package assignmentA;
import java.util.Scanner;
public class Geometric {

	public static void main(String[] args){
		
		int n, r = 4, a = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number");
			n = in.nextInt();
			
		for(int i = 1; i <= n ; i++){
			System.out.print(a + ", ");
			a = a * r;
		}
	}
}