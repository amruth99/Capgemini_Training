package Lab1;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		String s1 = new String("red");
		String s2 = new String("yellow");
		String s3 = new String("green");
		System.out.println("Enter your choice:");
    System.out.println("red or green or yellow");
    Scanner sc= new Scanner(System.in);
    String y = new String();
    y=sc.nextLine();
    if(y.equals(s1))
    {
    System.out.println("Stop");
    }
    else if (y.equals(s2))
    {
    	System.out.println("Ready");
    }
    else if (y.equals(s3))
    	{
    	System.out.println("Go");
    	}
    else 
    {
    	System.out.println("Enter a proper color");
    }
	}
}
