package exceptionhandling;

public class Eh5 {

	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		String str = null;
		try {
			j=15/i;
			
	        System.out.println(str.length());
		}
		catch(ArithmeticException ae) {
			System.out.println("cannot divided by zero");
		}
		catch(NullPointerException ne) {
			System.out.println("Null value");
		}
		finally {
			System.out.println("Clean Up");
		}
		
		System.out.println("Hello");

	}

}
