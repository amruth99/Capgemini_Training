package Lab1;

import java.util.Scanner;
 class Exercise6 {
	static int Square_Diff(int n){ 
		  
		int l, k, m; 
		    l = (n * (n + 1) * (2 * n + 1)) / 6;
		    k = (n * (n + 1)) / 2; 
		    k = k * k; 
		    m = Math.abs(l - k); 
		      
		    return m; 
		} 
	public static void main (String[]args) 
		{
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the value of n:");
            int n=sc.nextInt(); 
		    System.out.println(Square_Diff(n));           
	}
}

