package arrays;
import java.util.Scanner;
 public class Sorting{
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
		 boolean b1=true;
		 for(int i=0;i<n-1;i++) {
			 if(arr[i]>arr[i+1]) {
				 b1=false;
				
			 }	 
			 }
		 System.out.println(b1);
		 }
	 }