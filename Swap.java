package arrays;
import java.util.Scanner;
 public class Swap {
	 @SuppressWarnings("resource")
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number of values");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("entrof values");
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 int start=0;
		 int end=arr.length-1;
		 while(start<end) {
			 int temp=arr[start];
			 arr[start]=arr[end];
			 arr[end]=temp;
			 start++;
			 end--;
		 }
		 for(int i=0;i<n;i++) {
			 System.out.println(arr[i]);
		 } 
	 }
	}