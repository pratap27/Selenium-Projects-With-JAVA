package selenium;

public class constructor {
	
	 int  value1;
     int  value2;
     
     constructor(){
      value1 = 10;
      value2 = 20;
      System.out.println("Inside 1st Constructor");
    }
    constructor(int a){
     value1 = a;
     System.out.println("Inside 2nd Constructor");
   }
   constructor(int a,int b){
   value1 = a;
   value2 = b;
   System.out.println("Inside 3rd Constructor");
  }
  public void display(){
     System.out.println("Value1 === "+value1);
     System.out.println("Value2 === "+value2);
 }
 public static void main(String args[]){
   constructor d1 = new constructor();
   constructor d2 = new constructor(30);
   constructor d3 = new constructor(30,40);
   d1.display();
   d2.display();
   d3.display();
}

}
