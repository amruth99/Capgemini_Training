package lab5;

import java.util.Scanner;
/**
 * @author admin
 * */
public class pro5D {
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first name");
	String fname=s.nextLine();
	System.out.println("Enter last name");
	String lname=s.nextLine();
	
	try {
	if(lname.isEmpty() || fname.isEmpty()) {
		throw new NullPointerException();
	   }
	else
		System.out.println(fname+" "+lname);
	}catch(NullPointerException e) {
		System.out.println("Name field should not be empty");
	}
	
  }
}
