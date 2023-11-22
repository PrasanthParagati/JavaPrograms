package inheritance;

 class Animal implements cal,cal1 {
	
	void eat() {
		System.out.println("Animal eating");
	}

	public void mod() {
		System.out.println("Modulus");
		
	}

	public void div() {
	System.out.println("Division");
		
	}
	
}

class Dog extends Animal {
	 
	void run() {
		System.out.println("Dog running");
	}
}

public class Hybrid extends Dog {
	
	public static void main(String[] args) {
		
		Hybrid h = new Hybrid();
		
		h.div();
		h.mod();
		h.eat();
		h.run();
	}
}



