package loops;

//import java.util.Scanner;

public class Numberdivisibility {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) {
			
		 if(i%3==0 && i%5==0)
			{
				System.out.println("OrangeYellow");
			}
		 if(i%5==0) 
			{
				System.out.println("Mango");
			}
		 if(i%3==0) 
			{
				System.out.println("Orange");
			}
		 if(i%3!=0 && i%5!=0)
		 {
			 System.out.println(i);
		 }
		}

	}

}
