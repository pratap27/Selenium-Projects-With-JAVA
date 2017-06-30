package selenium_ng;

import java.util.Scanner;
import java.io.*;

public class practise_exa1 {

	public static void main(String[] args) {
		// variables
		Scanner re = new Scanner(System.in);
		System.out.println("Enter raidus: ");
		int r = re.nextInt();
		double pi = 3.143;
		float A = (float) (pi*r*r);
		
		System.out.println("area is: "+ A);
		// do while
		int x = 0;
		do{
			System.out.println(x);
			x++;
		}while(x<15);
		// while
		int y = 0;
		while(y<=5){
			System.out.println(y);
			y++;
			System.out.println("");
		}
		// for loop
		for(int i=4; i>0;i--){
			System.out.println(i);
		}
		// switch
		int number = 20;
		switch(number){
		case 10: System.out.println("10");
		case 20: System.out.println("20");
		case 30: System.out.println("30");
		default: System.out.println("in 10, 20 ,30");
		}
		// files
		
		String s = "line will be written in here";
		System.out.println("text to data.txt: "+s);
		try (FileWriter outFile = new FileWriter("Data.txt");
				BufferedWriter bw = new BufferedWriter(outFile)){
			bw.write(s);	
				}
		catch (IOException e) {  
            e.printStackTrace();  
		}
				
	}

}
