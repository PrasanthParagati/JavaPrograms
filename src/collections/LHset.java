package collections;

import java.util.LinkedHashSet;

public class LHset {

	public static void main(String[] args) {
	
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(234);
		
		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add("Prasanth");
		lhs.addAll(lhs1);
		System.out.println(lhs);
		
		lhs.contains(lhs1);
		System.out.println(lhs1);

	}

}
