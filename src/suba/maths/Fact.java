package suba.maths;

import java.util.*;

public class Fact {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int fact = sc.nextInt();
		// below calculation is correct for small range
		System.out.println(calculateZero(findfact(fact)));
		System.out.println(anotherFindFact(fact));

		// n+ (n-1)
		// System.out.println(findfact(fact));

	}

	private static int calculateZero(int findfact) {
		//System.out.println(findfact);
		int count = 0, sum = 0;

		while (findfact > 0) {
			int lastdigit = findfact % 10; // to take last didgit

			if (lastdigit == 0) {
				count++;
			}
			findfact = findfact / 10;

		}

		return count;
	}

	private static int findfact(int n) {

		if (n == 1) {
			return n;
		}

		return n * findfact(n - 1);
	}

	private static int anotherFindFact(int n) {
		int res = 0;
		for (int i = 5; i < n; i = i * 5) {
			res = res + n / i;
		}

		return res;

	}

}
