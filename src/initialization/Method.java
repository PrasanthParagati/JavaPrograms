package initialization;

public class Method {
	
	int empid;
	String empname;
	
	public void init(int empid,String empname) {
		
		this.empid=empid;
		this.empname=empname;
	}
	
	public void display() {
		
		System.out.println(empid);
		System.out.println(empname);
	}
	
	public static void main(String[] args) {
		
		Method m = new Method();
		m.empid=123;
		m.empname="prasanth";
		m.display();
	}

}
