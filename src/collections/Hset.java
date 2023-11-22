package collections;
import java.util.*;

public class Hset {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(123);
		hs.add("Prasanth");
		
		//System.out.println(hs);
		
		HashSet hs1 = new HashSet();
		hs1.add(333);
		hs1.add("Ayaan");
		hs1.add(123);
		
	    hs.addAll(hs1);
		
//		System.out.println(hs);
//		hs.remove(123);
		
		//System.out.println(hs);
		
		//hs.removeAll(hs1);
		System.out.println(hs);
		
		//System.out.println(hs.contains(333));
		//System.out.println(hs.containsAll(hs1));
		
		System.out.println(hs.isEmpty());

	}

}
