package constructor; 
class Parent {
	Parent(){//parent constructor
	super();
	System.out.println("Inside the parent Constructor");
	}
}
class Child extends Parent {
	Child(){
		System.out.println("Inside the child constructor");
		
	}

}
public class Samplecode {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		Child c1=new Child();
	}

}

