package src.mathematics;

public class FactorialNumber {
	
	public static int factorialNumber(int n) {
		int result = 1;
		
		for (int i = 2; i <= n ; i++) {
			result = result * i;
		}
		return result;
	}
	
	public static int fact(int n) {
		if(n == 0)
			return 1;
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialNumber(4));
		System.out.println(factorialNumber(0));
		System.out.println(fact(0));
		System.out.println(fact(3));
	}

}
