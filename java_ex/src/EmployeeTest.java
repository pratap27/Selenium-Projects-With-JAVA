import java.io.*;
public class EmployeeTest {
	public static void main(String args[]){
		// creating two objects with using constructor
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("mary anne");
		
		// Invoking methods for each object
		empOne.empAge(26);
		empOne.empDesignation("Developer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(24);
		empTwo.empDesignation("Designer");
		empTwo.empSalary(1200);
		empTwo.printEmployee();
	}
}
