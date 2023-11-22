package keywords;

public class Static {
	int empid;
	String empname;
	static String company;
	
	public Static(int empid,String empname) {
		
		this.empid=empid;
		this.empname=empname;
		
	}
	
	public void display() {
		System.out.println(empid+ " " + empname+ " " +company );
		
	}
	
	public static void main(String[] args) {
		
		Static s = new Static(123, "Ravi");
		Static s1 = new Static(124, "Prasanth");
		Static s2 = new Static(125, "Dilip");
		
		Static.company="Marolix";
		
		s.display();
		s1.display();
		s2.display();
		
		
		
	}

}
