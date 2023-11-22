package Strings;

public class RemoveSpaces {

	public static void main(String[] args) {
	
		String str = "This is    my      country";
		String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str1);

	}

}
