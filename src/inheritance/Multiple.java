package inheritance;

//Multiple inheritance  

//Acquiring the properties from multiple parent classes to single child class

public class Multiple implements cal,cal1 {
	
	int a=10,b=5,c;
	
	public void mod() {
		
		c=a%b;
		System.out.println(c);
		
	}

	public void div() {
		
		c=a/b;
		System.out.println(c);
		
		}
	
	
	public static void main(String[] args) {
		
		Multiple m = new Multiple();
		
		m.div();
		m.mod();
	}

}

