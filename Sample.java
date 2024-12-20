package ArrayDeque;
import java.util.ArrayDeque;
import java.util.Deque;
@SuppressWarnings("unused")
public class Sample {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(10);
		ad.addFirst(30);
		ad.addLast(70);
		System.out.println(ad);
	   
		
	}

}
