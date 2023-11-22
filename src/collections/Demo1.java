package collections;

//ArrayList

import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();

		l1.add(23);
		l1.add("Prasanth");
		l1.add(2, "Testing");
		
		System.out.println(l1);
		
		l1.set(1, "Anil");
		System.out.println(l1);
		
		for(Object l2:l1) {
			System.out.println(l2);
		}
		
	}

}
