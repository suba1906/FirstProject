package suba.recrusion;

public class SumOfDigit {

	static int val = 0;

	public static void main(String[] args) {

		int n = 1325;
		// System.out.println(n / 10);

		int ans = 0;
		System.out.println(sum(n));
		sum1(n);
		System.out.println(val);


	}

	private static String sum(int n) {

		if (n <= 0)
			return "";

		// int last = ;
		// System.out.println(last);
		return (n % 10) + sum(n / 10);

	}

	private static void sum1(int n) {

		if (n == 0)
			return;

		// int last = ;

		int rem = n % 10;

		val = val * 10 + rem;
		sum1(n/10);

	}
	

}
