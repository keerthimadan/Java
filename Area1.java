package polymorphisms;
import java.util.Scanner;
class Circle {
	double radius,area;
	static double pi;
	static {
		pi=3.142;
	}
	@SuppressWarnings("resource")
	void radius() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		radius=sc.nextDouble();
	}
	void area() {
		area=pi*radius*radius;
		System.out.println("The area of circle is"+area);
	}
}
public class Area1 {
	public static void main(String args[]) {
		Circle c=new Circle();
		c.radius();
		c.area();
	}

}
