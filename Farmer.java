package polymorphisms;
import java.util.Scanner;
class Farmer {
	double principle;
	static double rate;
	double time;
	double simpleInterest;
	static {
		rate=2.5;
	}
	@SuppressWarnings("resource")
	void CollectData() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the principle amount:");
		principle=s.nextDouble();
		System.out.println("Enter the time in Years:");
		time=s.nextDouble();
	}
	void Calculate()
	{
		simpleInterest=(principle*time*rate)/100;
	}
	void Display()
	{
		System.out.println("The simple interest is:"+simpleInterest);
	}
	}
public class Static {
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		System.out.println(Test.a);
		System.out.println(Test.b);
		System.out.println(Test.c);
		Test t=new Test();
		t.display();
		t.display1();

	}

}
