package suba.recrusion;

public class FactorialRecrusive {

	public static void main(String[] args) {

		int fact = 5;

		int ans = factorial(fact);
		//factorial(fact);

		System.out.println(ans);
	}

	private static int factorial(int fact) {

		if (fact == 1)
			return 1;

		return fact * factorial(fact - 1);
	}

}
