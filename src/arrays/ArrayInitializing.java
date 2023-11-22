package arrays;

public class ArrayInitializing {
	
	public static void main(String[] args) {
		
		//Datatype [] Variable_name = new Datatype[int size];
		int [] i = new int[5];
		//checking wether default values print or not
		System.out.println(i[0]);
		System.out.println(i[2]);
		//Assigning values
		i[0]=23;
		i[2]=45;
		//Printing values after assigning
		System.out.println(i[0]);
		System.out.println(i[2]);
		
	}

}
