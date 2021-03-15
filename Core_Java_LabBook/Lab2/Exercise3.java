package Lab2;
import java.util.Arrays;
import java.util.Scanner;
 
public class Exercise3 {
public static void  getSorted(int arr[]){

int temp[]=new int[arr.length];
for(int i=0;i<arr.length;i++) {
String s = Integer.toString(arr[i]);
char ch[]=s.toCharArray();
String s1="";
for(int j=ch.length-1;j>=0;j--) {
s1+=ch[j];
}
temp[i]=Integer.parseInt(s1);
}
Arrays.sort(temp);
for(int j=0;j<temp.length;j++) {
System.out.println(temp[j]);
}

}
public static void main(String [] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int n= sc.nextInt();
System.out.println("enter the elements of the array");
int arr[]=new int[n];
for(int i=0;i<n;i++) {
arr[i]=sc.nextInt();
}
getSorted(arr);
 
}
}
