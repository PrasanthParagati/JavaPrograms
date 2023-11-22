package loopnumberseries;

import java.util.Scanner;

public class Numberreverse {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number"); 
		int num = sc.nextInt();  //123
		int rev=0;               
		
		while(num>0) {
			
			rev = rev*10 + num%10; //rev=0+3=3 ,rev=30+2=32 ,rev=320+1=321

             num = num/10;         //num=123/10=12 ,num=12/10=1
			
		}
		
		System.out.println("reverse number is " + rev);

	}

}
