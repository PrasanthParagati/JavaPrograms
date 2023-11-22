package polymorphism;

public class Overload {
	
	int a=13,b=12;
	
	void sum() {
		
		
		System.out.println("sum is :" + (a+b));
	}
	
	
	void sum(int x,int y) {
		
		System.out.println("sum is :" + (x+y));
	}
	
	void sum(int x,int y,int z) {
		
		System.out.println("sum is :" + (x+y+z));
	}
	
	public static void main(String[] args) {
		
		Overload o = new Overload();
		
		o.sum();
		o.sum(12, 9);
		o.sum(5, 9, 11);
		
		
		
	}

}
