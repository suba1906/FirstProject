package suba.recrusion;

public class CountZero {

	public static void main(String[] args) {

		int a = 30190000;
		int zero = 0;
		System.out.println(count(a, zero));
	}

	private static int count(int a, int zero) {

		if (a == 0)
			return zero;

		int rem = a % 10;
		System.out.println("rem " + a % 10);
		System.out.println("zero " + zero);

		if (rem == 0)
			return count(a / 10, ++zero );
		else
			return count(a / 10, zero);
		

	}

}
