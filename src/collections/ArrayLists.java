package collections;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(123);
		a1.add("Prasanth");
		a1.add("Testing");
		System.out.println(a1);
		
		a1.add(1, "Sarath");
		System.out.println(a1);
		
		System.out.println(a1.size());
		
		a1.set(1, "Kiran");
		System.out.println(a1);
		System.out.println(a1.get(2));
		
		System.out.println(a1);
		
		a1.remove(1);
		System.out.println(a1);

	}

}
