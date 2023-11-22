package Strings;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		
		String str = "!@##$ j $%^  a  (*&  v  <>>   a";
		String str1 = str.replaceAll("[^a-zA-Z0-1]", "");
		
		System.out.println(str1);

	}

}
