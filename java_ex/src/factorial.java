import java.util.Scanner;

public class factorial {
	public static void main(String args[]){
		int i,fact = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		
		for (i=1;i<=n;i++){
			fact = fact*i;
		}
		System.out.println("Factorial of "+ n + " is "+ fact);
		
	}

}
