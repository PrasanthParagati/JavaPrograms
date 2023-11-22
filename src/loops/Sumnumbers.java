package loops;

// sum of all numbers

import java.util.Scanner;

public class Sumnumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range of sum");
		
		int n = sc.nextInt();
	
		int i,sum=0;
		
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of all numbers is " + sum);
		sc.close();

	}

}
