package ifelse;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is even numver.");
		}
		else {
			System.out.println(num + " is odd number.");

		}
		sc.close();

	}
}