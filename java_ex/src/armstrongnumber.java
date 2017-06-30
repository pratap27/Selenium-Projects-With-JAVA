import java.util.Scanner;

public class armstrongnumber {
	public static void main (String args[]){
		int c =0,a,temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		temp=n;
		while (n>0){
			a = n%10;
			n = n/10;
			c = c+(a*a*a);
		}
		if (temp==c)
		System.out.println("armstrong number");
		
		else
		System.out.println("not armstrong number");
	}
}
