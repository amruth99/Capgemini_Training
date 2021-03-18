package lab5;
import java.util.*;
/**
 * @author admin
 * */
class EmployeeException extends Exception {
	public EmployeeException(String s) {
		super(s);
	}
}

public class pro5F {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Salary of Employee");
		double salary=s.nextDouble();
		try {
			if(salary<3000)
				throw new EmployeeException("Fine");
			else
				System.out.println("Salary : "+salary);
		}catch(EmployeeException e) {
			System.out.println("Salary is less than 3000.");
		}
	}

}
