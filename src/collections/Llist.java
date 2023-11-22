package collections;
import java.util.*;

public class Llist {

	public static void main(String[] args) {
		
		List ll1 = new LinkedList();
		
		ll1.add(1);
		ll1.add("Prasanth");
		ll1.add(0, 555);
		System.out.println(ll1);
		
//		ll1.set(2, "siddu");
//		System.out.println(ll1);
//		
//		ll1.remove("siddu");
//		System.out.println(ll1);
		
		System.out.println(ll1.contains(1));
		
		System.out.println(ll1.get(2));
	
		

	}

}
