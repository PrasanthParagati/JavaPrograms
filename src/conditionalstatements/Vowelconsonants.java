package conditionalstatements;

import java.util.Scanner;

public class Vowelconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Alphabet");
		char ch = sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
		{
		System.out.println(ch + " Is Vowel");	
		}else 
		{
			System.out.println(ch + " Is Consonant");
		}
		

	}

}
