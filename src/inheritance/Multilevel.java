package inheritance;

//Multilevel inheritance

public class Multilevel extends Single1 {
	
	void div() {
		
		int a=10,b=5,c;
		c=a/b;
		System.out.println("Division is :" +c);
		
	}

	public static void main(String[] args) {
		
		Multilevel m = new Multilevel();
		m.add();
		m.mul();
		m.div();
		m.sub();
		

	}

}
