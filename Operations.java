import java.util.InputMismatchException;
import java.util.Scanner;

public class Operations implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
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

	public void Add() {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("resource")
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

	

public class MultipleThrededPrograms {
	public static void main(String args[]) throws InterruptedException{
		Operations op1=new Operations();
		Operations op2=new Operations();
		Operations op3=new Operations();
		Thread t1=new Thread (op1);
		Thread t2=new Thread (op2);
		Thread t3=new Thread (op3);
		t1.setName("Add");
		t2.setName("Print");
		t3.setName("Bank");
		t1.start();
		t2.start();
		t3.start();
	}
}
