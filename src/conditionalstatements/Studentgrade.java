package conditionalstatements;

// Nested if

import java.util.Scanner;

public class Studentgrade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks obtained : ");
		
		int marks = sc.nextInt();
		
		String grade;
		
		if(marks>=90) {
			grade = "A grade";
		}
		else if(marks>=80) {
			grade = "B grade";
		}
		else if(marks>=70) {
			grade = "C grade";
		}
		else if(marks>=60) {
			grade = "D grade";
		}
		else if(marks>=35) {
			grade = "E grade";
		}
		else {
			grade = "Fail";
		}
		
		System.out.println("The grade is: " + grade);
		
		sc.close();
			

	}

}
