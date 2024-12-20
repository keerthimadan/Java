package Exception;
 class ThrowsException3 {
	 public static void main(String args[]) {
		 checkage(16);
	 }

	static void checkage(int i)throws ArithmeticException {
		// TODO Auto-generated method stub
		if(i<18) {
			throw new ArithmeticException("You must be 18 or above 18 to vote");
		}
		else {
			System.out.println("You are eligible to vote");
		}
	}

}
