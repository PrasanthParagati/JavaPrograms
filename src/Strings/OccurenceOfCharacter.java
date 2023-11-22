package Strings;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		
		String str = "RangeRover";
		char resultchar = 'R';
		int count = 0; 
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == resultchar)
			{
				count++;
			}
		}
		System.out.println("the character occurence is :" +count);

	}

}
