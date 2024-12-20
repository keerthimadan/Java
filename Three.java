package Inheritance; 
class One {
	public void print_hello()
	{
		System.out.println("Hello");
	}
	public void print_hello_world() {
		System.out.println("hello world");
	}
	public void print_keerthi() {
		System.out.println("keerthi");
	}
}
class Two extends One{
	public void print_world() {
		System.out.println("World");
	}
}


public class Three extends Two {
	public void print_keerthi() {
		System.out.println("Keerthi");
	}

}
class Start3 {
	public static void main(String args[]) {
		Three t=new Three();
		t.print_hello();
		t.print_world();
		t.print_hello_world();
		t.print_keerthi();
	}

}
