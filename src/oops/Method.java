package oops;

public class Method {
	
	int rollno;
	String stdname;
	String grade;
	
	
	void set(int roll,String name,String grad) {
		
		rollno = roll;
		stdname = name;
		grade = grad;
		
	}
	
	void display() {
		
		System.out.println("Student RollNumber is :" + rollno);
		System.out.println("Student Name is : " + stdname);
		System.out.println("Student Grade is : " + grade);
	}

	public static void main(String[] args) {
		
		Method student = new Method();
		
		student.set(123, "Dilip", "A");
		
		student.display();
	
		

	}

}
