package loops;
 //Given number is prime or not

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		
		int num=sc.nextInt();
		
		int i,count=0;
		
		for(i=0;i<=num;i++) 
		{
			if(num%i==0)
			{
				count++;
			}
		}if(count==2)
		{
			System.out.println("Given number is Prime number");
		}
		else 
		{
			System.out.println("Given number is Not Prime number");
		}
		sc.close();

	}

}
