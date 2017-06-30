import java.util.Scanner;
import java.lang.*;

public class area {
	 public static void main(String[] args){
	        System.out.println("Hello Java: ");

	        Scanner reader = new Scanner(System.in);
	        System.out.println("Enter the radius of circle: ");

	        int r = reader.nextInt();
	        //System.out.println("You entered " + n);
	        double pi = 3.14;
	        int A = (int) (pi* r*r);
	        System.out.println("The radius of circle: "  + A);

	    }
}