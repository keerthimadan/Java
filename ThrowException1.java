package Exception;

import java.util.Scanner;
class ThrowException1 {
	 public static void main(String args[])  {
			try {
				ShowException();
			}
			catch(ArithmeticException e) {
				System.out.println("Exception from different function");
			}
		 }

		 @SuppressWarnings("resource")
		static void ShowException() {
			// TODO Auto-generated method stub
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Division operation");
				System.out.println("Enter the numerator:");
				int num=sc.nextInt();
				System.out.println("Enter the denominator:");
				int deno=sc.nextInt();
				int res=num/deno;
				System.out.println(res);
			}
			catch( ArithmeticException e) {
				throw e;
			}
		}
	}
		
		
