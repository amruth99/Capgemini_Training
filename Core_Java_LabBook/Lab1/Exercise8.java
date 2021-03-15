package Lab1;
import java.io.*;
import java.util.Scanner;
public class Exercise8 {

	static boolean result(int n)
	{
		if(n==0)
			return false;
		else 
			while(n!=1)
			{
				if(n%2!=0)
					return false;
					else
						n=n/2;
			}
	return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		boolean y=(result(num));
			System.out.println(y);
	}
}
