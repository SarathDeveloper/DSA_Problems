package Strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "geeks";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));
		
		//SCP
		System.out.println("************** SCP **************************");
		
		String s1 = "geeks";
		String s2 = "geeks";
		
		if(s1 == s2)
			System.out.println("yes");
		else
			System.out.println("No");
		
		String s3 = new String("geeks");

		if(s1 == s3)
			System.out.println("yes");
		else
			System.out.println("No");
		
		
		System.out.println("************** other methods **************************");
		
		String str1 = "geeksforgeeks";
		String str2 = "geeks";
		
		// returns true or false
		System.out.println(str1.contains(str2));
		System.out.println(str1.equals(str2));
		
		//returns integer
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.indexOf(str2));
		System.out.println(str1.indexOf(str2,5));
		
		
		System.out.println("************** str concat method **************************");
		String string1 = "geeks";
		String string2 = string1;
		
		 string1 =string1.concat("forgeeks");
		 System.out.println(string1);
		 System.out.println(string1 == string2);
		 System.out.println(string2);
		

		

	}

}
