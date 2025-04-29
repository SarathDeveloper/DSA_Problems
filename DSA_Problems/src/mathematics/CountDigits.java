package mathematics;

public class CountDigits {
	public static int countDigits(int x) {
		int count = 0;
		while(x > 0) {
			x = x/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int ans = countDigits(122334);
		System.out.println(ans);
		int ans1 = countDigits(1222);
		System.out.println(ans1);
		int ans2 = countDigits(12);
		System.out.println(ans2);
		int ans3 = countDigits(123);
		System.out.println(ans3);
	}

}
