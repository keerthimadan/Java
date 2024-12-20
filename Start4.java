package Exception;

 @SuppressWarnings("serial")
class MyException extends Exception {
	 public MyException(String s) {
		 super(s);
	 }
}

import java.util.Scanner;

public class Start4 {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		try {
			throw new MyException("New Exception");
		}
		catch(MyException ex) {
			System.out.println("Exception caught");
			System.out.println(ex.getMessage());
		}
	}
}