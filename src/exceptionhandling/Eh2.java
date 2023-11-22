package exceptionhandling;

public class Eh2 {
	
	public void m1() throws Throwable {
		
		System.out.println("Prasanth");
		Thread.sleep(5000);
	     System.out.println("Kumar");
		
	}
	
	public static void main(String[] args) throws Throwable {
		
		Eh2 e = new Eh2();
		e.m1();
	}

}
