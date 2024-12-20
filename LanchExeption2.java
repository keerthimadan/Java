import java.util.InputMismatchException;
import java.util.Scanner;

public class LanchExeption2 {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Division operation");
			System.out.println("Enter the numerator:");
			int num=sc.nextInt();
			System.out.println("Enter the denominator:");
			int deno=sc.nextInt();
			int res=num/deno;
			System.out.println(res);
			System.out.println("Array operation");
			System.out.println("Enter the array size");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the position number:");
			int pos=sc.nextInt();
			int val = 0;
			arr[pos]=val;
			System.out.println("Data Added");
		}
		//specific catch
		catch(InputMismatchException e1) {
			System.out.println("Input is not valid");
		}
		catch(ArithmeticException e2) {
			System.out.println("Arithmetic Exception ocured");
		}
		catch(NegativeArraySizeException e3) {
			System.out.println("Array size cannot be negative");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("Specified index is out of range");
		}
		//Generic catch
		catch(Exception e) {
			System.out.println("Exception handled in generic method");
		}
			
		}
}
