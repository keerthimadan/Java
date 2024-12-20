package LinkedHashSet;
import java.util.LinkedHashSet;
public class Sample {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String arrgs[]) {
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(40);
		lh.add(37);
		lh.add(24);
		lh.addFirst(23);
		lh.addLast(34);;
		System.out.println(lh);
	}

}
