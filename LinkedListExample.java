package LinkedList;
import java.util.LinkedList;
public class LinkedListExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
	 LinkedList ll=new LinkedList();
	 ll.add(50);
	 ll.add("ineuron");
	 System.out.println(ll);
	 ll.addFirst("Hello");
	 ll.add(5,3);
	 ll.addLast("Bangalre");
	 System.out.println(ll);
	}
		
	}

