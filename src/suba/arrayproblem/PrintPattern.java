package suba.arrayproblem;

import java.util.ArrayList;
import java.util.List;

public class PrintPattern {
	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {

		int N = 16;

		// list.add(N);
		rec(N, N);
		// rec(0, 1, N);
		System.out.println(list);
		// rec(N, 5);
	}

	private static void rec(int i, int N) {

		if (i <= 0) {
			list.add(i);
			return;
		}
		list.add(i);
		rec(i - 5, N);
		// System.out.println(i);
		list.add(i);
	}

}
