package Exception;

 @SuppressWarnings("serial")
class MyException extends Exception {
	 public MyException(String s) {
		 super(s);
	 }
}
public class Start5 {
	public static void main(String args[]) {
		try {
			throw new MyException("New Exception");
		}
		catch(MyException ex) {
			System.out.println("Exception caught");
			System.out.println(ex.getMessage());
		}
	}

}
