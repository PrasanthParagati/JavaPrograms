package keywords;

public class This {
	int rollno;
	String name;
	
	public This(int rollno,String name) {
		
		this.rollno=rollno;
		this.name=name;
	
	}
	
	
    public static void main(String[] args) {
	
    	This t = new This(12,"prasanth");
    	System.out.println(t.name);
    	System.out.println(t.rollno);
        
    	
    	
	}

}
