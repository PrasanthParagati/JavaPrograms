package conditionalstatements;

import java.util.Scanner;

public class Vowelswitch {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any alphabet");
		
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'a': System.out.println("Given alphabet is Vowel");break;
		case 'e': System.out.println("Given alphabet is Vowel");break;
		case 'i': System.out.println("Given alphabet is Vowel");break;
		case 'o': System.out.println("Given alphabet is Vowel");break;
		case 'u': System.out.println("Given alphabet is Vowel");break;
		case 'A': System.out.println("Given alphabet is Vowel");break;
		case 'E': System.out.println("Given alphabet is Vowel");break;
		case 'I': System.out.println("Given alphabet is Vowel");break;
		case 'O': System.out.println("Given alphabet is Vowel");break;
		case 'U': System.out.println("Given alphabet is Vowel");break;
		default : System.out.println("Given alphabet is Consonant");break;
		
		
		
		}
		
		sc.close();

	}

}
