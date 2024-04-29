package suba.stackqueueproblem;

import java.util.Stack;

public class EvaluatePostFix {

	public static void main(String[] args) {

		String a = "1211010++";

		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < a.length(); i++) {
			Character ch = a.charAt(i);
			// System.out.println(ch - '0');

			if ((ch - '0') >= 0 && (ch - '0') <= 9) {
				// System.out.println("digit " + ch);

				s.push(ch - '0');
			} else {

				int aa = s.isEmpty() ? 1 : s.pop();
				int bb = s.isEmpty() ? 1 : s.pop();

				s.push((performopertaor(ch, aa, bb)));

			}
		}

		System.out.println(s.peek());

	}

	public static int performopertaor(char ch, int a, int b) {

		/*
		 * System.out.println(a); System.out.println(b);
		 */

		if (ch == '+') {
			// System.out.println("+ " + (a + b));

			return b + a;
		} else if (ch == '-') {
			// System.out.println("- " + (a - b));

			return b - a;

		} else if (ch == '*') {
			// System.out.println("* " + (a * b));

			return b * a;
		} else {
			/// System.out.println("/ " + a / b);

			return b / a;
		}
	}

}
