package suba.recrusion;

public class StepReduceToZero {

	public static void main(String[] args) {

		int n = 8;

		int step = 0;
		System.out.println(reduce(n, step));
	}

	private static int reduce(int n, int step) {

		if (n == 0)
			return step;

		if (n % 2 == 0)
			return reduce(n / 2, ++step);
		else
			return reduce(n - 1, ++step);
	}

}
