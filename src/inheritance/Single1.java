package inheritance;

public class Single1 extends Single {  //Single inheritance Child class
	
	void mul() {
		
		int a=3,b=4,c;
		c=a*b;
		System.out.println("Multiplication is :" +c);
	}
	
	
	public static void main(String[] args) {
		
		Single1 s = new Single1();
		
		s.add();
		s.mul();
		s.sub();
		

	}

}
