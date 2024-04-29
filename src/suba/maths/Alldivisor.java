package suba.maths;

import java.util.*;

public class Alldivisor {

	public static void main(String[] args) {

		int n = 15;
		
		System.err.println(Math.pow(51,15));

		int i;
		for (i = 1; i * i <= n; i++) {

			if (n % i == 0) {
				System.out.println(i);

				/*
				 * if (i != n / i) { System.out.println(n/i); }
				 */

			}

		}

		for (; i * i >= 1; i--) {

			if (n % i == 0) {
				System.out.println(n / i);
			}

		}

	}

}
