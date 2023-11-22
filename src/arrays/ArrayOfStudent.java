package arrays;


class Student {
	
	int rollno;
	String name;
}

public class ArrayOfStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "Prasanth";
		
		Student s2 = new Student();
		s2.rollno = 2;
		s2.name = "Ravi";
		
		Student s3 = new Student();
		s3.rollno = 3;
		s3.name = "Ayaan";
		
		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name +":" + students[i].rollno);
		}
		
	}

}
