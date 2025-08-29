package Strings;

public class PalindromCheck {
	
	
	//Efficient solution 1
	static boolean isPal(String str) {
		
		int begin = 0;
		int end = str.length() - 1;
		
		while(begin < end) {
			if( str.charAt(begin) != str.charAt(end) ) 
				return false;
			begin ++;
			end --;
		}
		
		return true;
	}

	
	//Efficient solution 2
	static boolean isPal2(String str) {
		
	  StringBuilder reversed = new StringBuilder();
	  
	  for(int i= str.length() - 1;i >= 0;i--) {
		  reversed = reversed.append(str.charAt(i));
	  }
		return str.equals(reversed.toString());
	}
	
	// Naive solution
	static boolean isPal3(String str) {
		
		  String reversed ="";
		  
		  for(int i= str.length() - 1;i >= 0;i--) {
			  reversed += str.charAt(i);
		  }
			return str.equals(reversed);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans =isPal("ABBAi");
		boolean ans1 = isPal2("ABBA");
		boolean ans2 = isPal3("ABBA2");
		System.out.println(ans2);

	}

}
