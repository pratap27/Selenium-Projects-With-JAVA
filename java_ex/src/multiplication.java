import java.util.Scanner;

public class multiplication {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		
		for (int i=0;i<10;i++){
			System.out.println(n+ " x "+ (i+1) + " = " +(n*(i+1)));
		}
		
	}

}
