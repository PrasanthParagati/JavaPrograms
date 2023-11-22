package encapsulation;

public class Emp {
	
	private int empid;
	private String empname;
	
	public void setid(int id) {
		
		empid=id;
		
		}
	public void setname(String name) {
		empname=name;
	}
	
	public int getid() {
		return empid;
	}

	public String getname() {
		return empname;
	}
	
	public void display() {
		System.out.println(empid);
		System.out.println(empname);
	}
	

	
	}
