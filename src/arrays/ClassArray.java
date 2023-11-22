package arrays;

class Employee1 {
	int eid;
	String ename;
	String domain;
	
	public Employee1(int eid,String ename,String domain) {
		this.eid=eid;
		this.ename=ename;
		this.domain=domain;
	}

	@Override
	public String toString() {
		
		return "Employee1 [eid = "+eid+", ename = "+ename+",domain = "+domain+"]" ;
	}
	
}

public class ClassArray {

	public static void main(String[] args) {
		
		Employee1[] employees = new Employee1[2];
		System.out.println(employees[0]);
		System.out.println(employees[1]);
		
		employees[0] = new Employee1(123, "Prasanth", "Testing");
		employees[1] = new Employee1(234, "Ayaan", "Testing");
		
		System.out.println(employees[0]);
		System.out.println(employees[1]);
		
		

	}

}
