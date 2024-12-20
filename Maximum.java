package arrays;
import java.util.Scanner;
public class Maximum {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of values");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("entrof values");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
	}
	System.out.println(max);
}
}

