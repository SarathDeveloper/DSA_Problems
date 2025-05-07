package src.mathematics;

public class TrailingZerosInFactorial {
	
	
	
	//Not Efficient 
	//→ Overflow will happen very quickly
//	You multiply numbers from 1 to n → This loop is O(n)
//	Even if you fix overflow by using BigInteger,
//	handling such huge numbers is slow and wasteful
	
	public static int countTrailingZeros(int n) {
		int fact = 1;
		for ( int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		int count = 0;
		while( fact % 10 == 0) {
			count ++;
			fact = fact / 10;
		}
		return count;
	}

	
	//Efficient solution
//	✅ No need to compute full factorial
//	✅ Time complexity = O(log₅ n) (Very fast, small loop)
//	✅ Space = O(1)
//	✅ No integer overflow (We’re just dividing numbers — no big multiplications)
	
	public static int trailingZeros(int n) {
		int count = 0;
		for(int i = 5; i <= n; i = i * 5) {
			count = count + n / i;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countTrailingZeros(251));
		System.out.println(trailingZeros(251));

	}

}
