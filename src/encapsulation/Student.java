package encapsulation;

public class Student {
	
	private int stdrollno;
	private String stdname;


	public int getStdrollno() {
		return stdrollno;
	}

	public void setStdrollno(int stdrollno) {
		this.stdrollno = stdrollno;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
	 s1.setStdname("dilip");
	 s1.setStdrollno(345);
		
		System.out.println(s1.stdname);
		System.out.println(s1.stdrollno);
		 

}
	
}
