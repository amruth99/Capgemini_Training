package lab6;
/**
 * @author admin
 * */
import java.util.Scanner;

public class Lab6E {
	public static void main(String[] args) {
		String s=new Scanner(System.in).nextLine();
		int flag=0;
		for(int i=1;i<s.length();i++)
		{
			if((int)s.charAt(i)<(int)(s.charAt(i-1)))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("not positive");
		}
	}

}
