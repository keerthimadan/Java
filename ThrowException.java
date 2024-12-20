import java.util.Scanner;

class ThrowException {
	 public static void main(String args[])  {
		try {
			ShowException();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception from different function");
		}
	 }

	 @SuppressWarnings("resource")
	static void ShowException() {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Array operation");
			System.out.println("Enter the array size");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the position number:");
			int pos=sc.nextInt();
			int val = 0;
			arr[pos]=val;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw e;
		}
	}
}
	
	

