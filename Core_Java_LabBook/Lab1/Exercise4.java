package Lab1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise4 {
	public static void removeDup(int arr[]) {

		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
		h.add(arr[i]);
		}
		int temp[]=new int[h.size()];
		int i=0;
		for(Integer x:h) {
		temp[i]=x;
		i++;
		}
		Arrays.sort(temp);

		for(int j=temp.length-1;j>=0;j--) {
		System.out.println(temp[j]);
		}

		}
		public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		}

		removeDup(arr);

		}
}
