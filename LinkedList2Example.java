package LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedList2Example {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		LinkedList l1=new LinkedList();
		l1.add(50);
		l1.add("Ineuron");
		System.out.println(l1);
		l1.addFirst("Hello");
		l1.add(3,99);
		l1.add("Bangalore");
		System.out.println(l1);
		ListIterator litr1=l1.listIterator();
		while(litr1.hasNext()) {
			System.out.println(litr1.next());
		}
	}

}
