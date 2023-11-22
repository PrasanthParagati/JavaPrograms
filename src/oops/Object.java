package oops;

public class Object {
	
	int empid;
	String empname;
	String domain;
	
	void display()
	{
		System.out.println("Employee ID is :" + empid);
		System.out.println("Employee Name is :" + empname);
		System.out.println("Employee Domain is :" + domain);
	}
	
	
	
	public static void main(String[] args) {
		
		Object o = new Object();
		
		o.empid = 113;
		o.empname = "Prasanth";
		o.domain = "Testing";
		
		o.display();
	
		

	}

}
