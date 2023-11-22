package exceptionhandling;

public class Eh1 {
	
	public static void main(String[] args) {
	
		int i=2;
		int j=0;
		
		int nums[] = new int[5];
		String str = null;
		
		try {
			 j=18/i;
			 
			 System.out.println(nums[1]);
			 System.out.println(nums[5]);
			 System.out.println(str.length());
		}
		
		catch(ArithmeticException ae) {
			System.out.println("can not divide by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceeding the limit");
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(j);
		System.out.println("end");
		
	}

}
