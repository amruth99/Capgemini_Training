package Practicetest1;
import java.util.Scanner;
class Employee {
	private String firstName;
	private String lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void validate() throws Exception {
		try {
			if (firstName == null || lastName == null) {
				throw new NullPointerException("Entry Missing");
			}
			if (firstName.length() < 3 || lastName.length() < 3) {
				throw new InvalidNameException("Name should be minimum 3 characters");
			}
			System.out.println("Valid name");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
@SuppressWarnings("serial")
class InvalidNameException extends Exception {
	public InvalidNameException(String msg) {
		super();
	}
}
public class Question3 {

	public static void main(String[] args) throws Exception {
		Employee employee = new Employee(null, "Amruth");
		employee.validate();
		Employee employee2 = new Employee("ab", "cd");
		employee2.validate();
		Employee employee3 = new Employee(null, null);
		employee3.validate();	
	}
		
}
