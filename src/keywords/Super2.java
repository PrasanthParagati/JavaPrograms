package keywords;

public class Super2 extends Super1 {
	
	String stdname = "Keerthi";
	int rollno = 567;
	 
	void display() {
		
		System.out.println(super.stdname);
		System.out.println(super.rollno);
	}
	

	public static void main(String[] args) {
		
		Super2 s2 = new Super2();
		System.out.println(s2.stdname);
		System.out.println(s2.rollno);
		s2.display();
	}
}
