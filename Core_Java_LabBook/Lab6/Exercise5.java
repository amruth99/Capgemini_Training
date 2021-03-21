package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise5 {

	public static int getSecondSmallest(int[] arr) {
		ArrayList<Integer> myArr = new ArrayList<Integer>();
		for (int i : arr) {
			myArr.add(i);
		}

		Collections.sort(myArr);

		return myArr.get(1);
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = read.nextInt();
		System.out.println("Enter array elements:");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = read.nextInt();
		}
		System.out.println("Entered Array:");
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("Second Smallest of the Array:" + getSecondSmallest(arr));
	}
}