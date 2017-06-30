package selenium;

import java.util.Scanner;

public class fibonaci {

	public static void main(String[] args) {
		int n1=0,n2=1;
		int n3,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no: ");
		int count = sc.nextInt();
		 
		
		System.out.print(n1+" "+n2);
		for(i=2;i<count; i++){
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
		

			  int r,sum=0,temp;    
			  int n=454;//It is the number variable to be checked for palindrome  
			  
			  temp=n;    
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			

	}

}
