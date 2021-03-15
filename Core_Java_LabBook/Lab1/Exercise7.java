package Lab1;
import java.util.Scanner;

class Exercise7 {
	 static boolean calculate(int number,int currentDigit){
		currentDigit = number % 10;
	       number = number/10; 
		boolean flag = false;
	while(number>0)
    {
        if(currentDigit <= number % 10)
        {
            flag = true;
            break;
        }

        currentDigit = number % 10;
        number = number/10;
    }
    if(flag){
         return false;
    }else{
        return true;
    }
	}
	public static void main(String[] args) {
		int number=0;
		int currentDigit=0;
	       Scanner scanner = new Scanner(System.in);
	       System.out.println("Enter a numberber : ");
	       number = scanner.nextInt();
	        boolean y=(calculate(number,currentDigit));
	         System.out.println(y);
	}
	
}
	       


