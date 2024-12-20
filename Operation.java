import java.util.Scanner;
import java.util.InputMismatchException;
public class Operation extends Thread {
	public void run() {
		if(Thread.currentThread().getName().equals("Add")) {
			Add();
		}
		else  if(Thread.currentThread().getName().equals("Print")) {
			Print();
		}
		else {
			Bank();
		}
	}

	@SuppressWarnings("resource")
	public void Add() {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Task1:Addition operation started");
			System.out.println("Enter the first number:");
		    int num1= sc.nextInt();
		    System.out.println("Enter the second number:");
		    int num2=sc.nextInt();
		    int res=num1+num2;
		    System.out.println("Result is:"+res);
		    System.out.println("Task1:Addition operation completed");
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		catch(InputMismatchException e2) {
			e2.printStackTrace();
		}
		    
	}

	public void Print() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Task2:Printing operation started");
			for(int i=0;i<5;i++) {
				System.out.println("GTEC JAINX BANGALORE");
				Thread.sleep(2000);
			}
			System.out.println("Task2:Printing operation completed");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
			
		}

	public void Bank() {
		// TODO Auto-generated method stub
	try {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Task3:Banking operation started");
		System.out.println("Enter the pin code:");
		@SuppressWarnings("unused")
		int pin=sc.nextInt();
		System.out.println("Account details recorded");
		System.out.println("Task3:Banking operation completed");
	}
	catch(ArithmeticException e3) {
		e3.printStackTrace();
	}
	catch(InputMismatchException e4) {
		e4.printStackTrace();
	}
	}


}

public class MultipleThreadedProgram {
	public static void main(String args[]) throws InterruptedException{
		Operation op1=new Operation();
		Operation op2=new Operation();
		Operation op3=new Operation();
		op1.setName("Add");
		op1.setName("Print");
		op1.setName("Bank");
		op1.start();
		op2.start();
		op3.start();
	}
}
