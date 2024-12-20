package ArrayList;

import java.util.ArrayList;

public class Sample1 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) {
		ArrayList a11=new ArrayList();
		a11.add(30);
		a11.add(20);
		a11.add("keerthi");
		System.out.println(a11);
		ArrayList a12=new ArrayList();
		a12.add("Madan");
		a12.add(31);
		System.out.println(a12);
		ArrayList a13=new ArrayList();
		a13.add(a12);
		a13.add(55);
		a13.add(0,7);
		a13.add(3,4);
		System.out.println(a13);
	}

	
}
