package LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
public class LinkedList1Example {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		ArrayList al1=new ArrayList();
		al1.add("Hello");
		al1.add(20);
		al1.add("true");
		al1.add(10.9);
		Iterator itr1=al1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
	}

}
