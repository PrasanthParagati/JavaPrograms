package arrays;

class Employee {
	String ename;
	int eid;
}

public class ArrayOfEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.eid = 123;
		e1.ename = "Prasanth";
		
		Employee e2 = new Employee();
		e2.eid = 234;
		e2.ename = "Ayaan";
		
		Employee e3 = new Employee();
		e3.eid = 456;
		e3.ename = "Praveen";
		
		Employee employees[] = new Employee[3];
		employees[0] = e1;
		employees[1] = e2;
		employees[2] = e3;
		
		for(int i=0;i<employees.length;i++) {
			
			System.out.println(employees[i].ename + ":" + employees[i].eid);
		}
		

	}

}
