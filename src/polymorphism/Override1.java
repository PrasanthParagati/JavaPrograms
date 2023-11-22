package polymorphism;

public class Override1 extends Override {
	
	void add(int a, int b) {
		
		
		System.out.println("Multiplication is :" + (a*b));
	}
	
	public static void main(String[] args) {
		
		Override1 obj = new Override1();
		Override o = new Override();
		
		o.add(12, 5);
		obj.add(10, 12);
	}
	
	

}
