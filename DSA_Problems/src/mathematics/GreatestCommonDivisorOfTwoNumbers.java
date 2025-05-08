package src.mathematics;

public class GreatestCommonDivisorOfTwoNumbers {
	
	
	
	//Euclidean Algorithm
	static int gcd2(int a, int b) {
		if(b == 0)
			return a;	
		return gcd2(b , a % b);
	}
	
	
	//Naive Method
	// O(min(a,b))
	static int gcb1(int a, int b) {
		int res = Math.min(a, b);
		while(res > 0 ) {
			if( ( a % res == 0) && ( b % res == 0)) {
				break;
			}
			res--;
		}
		return res;
	}
	
	// SK - solution 
	public static int gcb(int a, int b) {
		int commonDivisor = 1;
		int givenGreatestNumber = Math.max(a, b);
		for(int i = 1; i <= givenGreatestNumber; i++) {
			if( (a % i == 0) && ( b % i == 0)) {
				commonDivisor = i;
			}
		}
		return commonDivisor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("////////");
		
		System.out.println(gcb(48,18));
		System.out.println(gcb1(48,18));
		System.out.println(gcd2(48,18));

	}

}
