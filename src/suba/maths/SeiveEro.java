package suba.maths;

import java.util.Arrays;

public class SeiveEro {

	public static void main(String[] args) {

		int n = 25;

		Boolean[] array = new Boolean[n + 1];
		Arrays.fill(array, true);

		for (int i = 2; i <= n; i++) {
			if (array[i]) {
				System.out.println(i);

				for (int j = i * i; j <= n; j = j + i) {
					array[j] = false;
				}
			}
		}
	}

}
