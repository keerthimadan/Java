package HashMap;
import java.util.LinkedHashMap;
public class HashMap{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) {
		LinkedHashMap hm=new  LinkedHashMap();
	    hm.put(10,"Sachin");
		hm.put(7, "MSD");
		hm.put(18, "Kohil");
		System.out.println(hm);
	}
}
