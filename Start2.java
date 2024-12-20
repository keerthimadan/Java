import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Start2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(10,"Sachin");
		hm.put(7, "MSD");
		hm.put(18, "Kohil");
		//System.out.println(hm);
		
		Collection c=hm.values();
		Iterator itr=c.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
	    }
		Set s=hm.entrySet();
		Iterator itr2=s.iterator();
		while(itr2.hasNext()) 
		{
			System.out.println(itr2.next());
		}
		
	}

}
