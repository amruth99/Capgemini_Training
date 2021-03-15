package Lab2;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int num=0;
		int temp=0;
		for( int i=0 ; i<size ;i++)
		{
			for (int j = i + 1; j < size; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  	
            }
		}
		System.out.println("Smallest element in the array is "+ arr[1]);
	}

}
