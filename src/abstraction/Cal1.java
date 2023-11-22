package abstraction;

public class Cal1 extends Cal {
	
	int a=5,b=4;

	public void add() {
		
		System.out.println("Addition is :" + (a+b));
		
		}

	public void sub() {
		
		System.out.println("Substraction :" + (a-b));
		
		}
	
	public static void main(String[] args) {
		
		Cal1 c = new Cal1();
		c.add();
		c.sub();
	}
	
	}
