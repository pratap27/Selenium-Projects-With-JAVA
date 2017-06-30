package selenium;

public class inheritance {

	public static void main(String[] args) {
	
		       X x= new X();
		       Y y = new  Y();
		       y.m2();
		       X g = new X();
		       g.sum(5, 7);
		       g.sum(4, 5, 9);
		      //x.m1();
		      //y.m1();
		     //x = y;// parent pointing to object of child
		     //x.m1() ;
		     //y.a=10;
		   }

		}

class X{
		   private int a;
		   public void sum(int d, int e){
			   System.out.println(d+e);
		   }
		   public void sum(int d, int e, int f){
			   System.out.println(d+e+f);
		   }
		   int b;
		      public void m1(){
		       System.out.println("This is method m1 of class X");
		     }
		}

class Y extends X{
		      int c; // new instance variable of class Y
		      public void m1(){
		            // overriden method
		            System.out.println("This is method m1 of class Y");
		        }
		       public void m2(){
		           super.m1();
		           System.out.println("This is method m2 of class Y");
		      }
	}




