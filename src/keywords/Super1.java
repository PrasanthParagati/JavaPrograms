package keywords;

public class Super1 extends Super {
	
	String stdname = "ravi";
	int rollno = 345;
	
	void display() {
		
		System.out.println(super.stdname);
		System.out.println(super.rollno);
	}

	public static void main(String[] args) {

		Super1 s1 = new Super1();
		System.out.println(s1.stdname);
		System.out.println(s1.rollno);
		s1.display();

	}

}
