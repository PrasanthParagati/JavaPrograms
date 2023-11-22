package initialization;

public class Object {
	
	int empid;
	String empname;
	
	void display() {
		System.out.println(empid);
		System.out.println(empname);
	}
	
	public static void main(String[] args) {
		
	   Object o = new Object();
		o.empid=123;
		o.empname="Prasanth";
		o.display();
		
		
	}

}
