package keywords;

public class Static2 {
	
	static int a=3,b=5;
	
	public  void add() {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		Static2 s = new Static2();
		s.add();
	}
	

}
