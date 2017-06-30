import java.util.*;

public class statements {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("FizzBuzz: Enter a number: ");
		int n = s.nextInt();
		for (int i=1;i<=n;i++){
			if((i%3==0)&&(i%5==0))
			System.out.println("FizzBuzz");
			else if(i%3==0)
			System.out.println("Fizz");
			else if(i%5==0)
			System.out.println("Buzz");
			else System.out.println(i);		
		}
	}
}
