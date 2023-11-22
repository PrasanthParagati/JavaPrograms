package keywords;

public class Static1 {
	
	int number;
	String vehical;
	static String owner;
	
	public Static1(int number,String vehical) {
		this.number=number;
		this.vehical="vehical";
		
	}
	
	public void display() {
		System.out.println(number+" "+vehical+" "+owner);
	}
	
	public static void main(String[] args) {
		
		Static1 s1 = new Static1(1234, "maruthi");
		Static1 s2 = new Static1(1235, "ferrari");
		Static1 s3 = new Static1(1236, "Tata");
		
		Static1.owner= "Prasanth";
		
		s1.display();
		s2.display();
		s3.display();
	}
	

}
