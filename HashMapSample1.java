package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapSample1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		HashMap hm=new HashMap();
		hm.put(10,"Sachin");
		hm.put(7, "MSD");
		hm.put(18, "Kohil");
		System.out.println(hm);
		Collection c=hm.values();
		Iterator itr=c.iterator();
		while(itr.hasNext());{
			System.out.println(itr.next());
	}
	}

}

