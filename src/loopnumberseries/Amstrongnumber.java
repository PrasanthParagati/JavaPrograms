package loopnumberseries;

import java.util.Scanner;

public class Amstrongnumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		//int num = 371;
		
		int temp=num;
		int r,sum=0;
		
		while(num>0)
		{
			r = num%10;
			num = num/10;
			sum = sum +(r*r*r);
			
		}
		if(temp == sum)
		{
			System.out.println("Given number is Amstrong number");
		}
		else
		{
			System.out.println("Given number is Not Amstrong number");
		}
				
		
		

	}

}
