package loopnumberseries;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int rev=0;
		int num1=num;
	
		
		while(num>0)
		{
			rev = rev*10 + num%10;
			num = num/10;
			
		}
		
		if(num1 == rev)
		{
			System.out.println( num1 + " is palindrome number");
		}
		else
		{
			System.out.println( num1 + " is not palindrome number");
		}

	}

}
