
public class Puppy {
	int puppyAge;
	
	public Puppy (String name){
		System.out.println("The name chosen is: " + name);	
	}
	
	public void setAge(int age){
		puppyAge = age;
	}
	public int getAge(){
		System.out.println("The puppy age is : " + puppyAge);
		return puppyAge;
	}
	public static void main(String[] args) {
		Puppy myPuppy = new Puppy("tummy");
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("Variable Value :" + myPuppy.puppyAge );
	}

}
