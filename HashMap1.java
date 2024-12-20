package HashMap;
import java.util.LinkedHashMap;
public class Sample2 {
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String args[]) {
		LinkedHashMap hm=new  LinkedHashMap();
	    hm.put(10,"Sachin");
		hm.put(7, "MSD");
		hm.put(18, "Kohil");
		for(Object obj:hm.entrySet()) {
		System.out.println(obj);
	}
}

}
