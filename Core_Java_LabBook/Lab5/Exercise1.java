package lab5;
import java.util.*;
/**
 * @author admin
 * */
class AgeException extends Exception {
	public AgeException(String s) {
		super(s);
	}
}

public class pro5E {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age");
		int age=s.nextInt();
		try {
			if(age<=15)
				throw new AgeException("Fine");
			else
				System.out.println("Age : "+age);
		}catch(AgeException e) {
			System.out.println("Age of a person should be above 15.");
		}
	}

}


