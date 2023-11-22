package constructor;

public class Employee {
	
	int empid;
	String empdomain;
	
	public Employee(int id,String domain) {    //Constructor
		
		empid = id;
		empdomain = domain;
		
	}
	
	void display() {
		
		System.out.println(empid);
		System.out.println(empdomain);
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee(123, "prasanth");
		Employee emp1 = new Employee(234, "ravi");
		emp.display();
		emp1.display();
		

	}

}
