package exceptionhandling;

public class Eh3 {
	
	int a=5;
	int b=0;
	
	public void m1() {
		
		System.out.println("this is start");
		
		try {
			
			System.out.println(a/b);
			}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			
			System.out.println("this is end");
		}
		
		finally {
			System.out.println("Execution completed");
		}
		
		}
	
	public static void main(String[] args) throws Throwable {
		
		Eh3 e = new Eh3();
		e.m1();
		
	}

}
