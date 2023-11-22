package exceptionhandling;

public class Eh4 {
	
	public void A() throws Throwable {
		int i=10;
		int j=0;
		try {
			int k=i/j;
		}
		catch(ArithmeticException ae) {
			System.out.println("Can not divide by zero");
		}
		
	}
	
	public void B() throws Throwable {
		
		String str = null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException ne) {
			System.out.println("cannot find length");
		}
		

	}

	public static void main(String[] args) throws Throwable {
		
		Eh4 e1 = new Eh4();
		e1.A();
		e1.B();
		
		
	
	}
}
