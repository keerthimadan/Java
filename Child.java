package Inheritance; 
class Parent {
	void eat() {
		System.out.println("Parent Eats");
	}
	void sleep() {
		System.out.println("Parent sleeps");
	}
	void run() {
		System.out.println("Parent runs 5km");
	}
}
public class Child extends Parent {
	void sleep() {
		System.out.println("child sleeps");
		
	}
	void swims() {
		System.out.println("child swims");
	}

}
public class Launch {
	public static void main(String args[]) {
		Child c1=new Child();
		c1.eat();
		c1.sleep();
		c1.run();
		c1.swims();
	}

}
