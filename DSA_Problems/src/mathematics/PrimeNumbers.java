package src.mathematics;

public class PrimeNumbers {

	
	//Naive Solution
	
	static boolean checkPrime(int n) {
		
		if(n == 1) return false;
		for(int i = 2; i < n; i++) {
			if( n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 19998977;
		boolean isPrime = checkPrime(number);
		
		if(isPrime) {
			System.out.println(number + " is Prime number");
		}else {
			System.out.println(number + " is NOT Prime number");
		}

	}

}
