package Strings;

public class Stringreverse {

	public static void main(String[] args) {
		
		String str = "prasanth";
		String rev =" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		
		}
		//System.out.println(rev);
		
		if(str == rev) {
			System.out.println("Palindrome");
			
		}else {
			System.out.println("Not palindrome");
		}

	}

}
