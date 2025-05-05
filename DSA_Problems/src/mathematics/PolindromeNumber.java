package mathematics;

public class PolindromeNumber {
	
	static boolean isPolindrome(int n) {
		
		int rev = 0;
		int temp = n;
		
		while( temp != 0) {
			int remainder = temp % 10;
			rev = rev * 10 + remainder;
			 temp = temp / 10;
		}
		
		return ( rev == n);
	}
	
	public static void main(String[] args) {
		
		System.out.println( isPolindrome(666));
		System.out.println( isPolindrome(660));
		System.out.println( isPolindrome(676));
	}

}
