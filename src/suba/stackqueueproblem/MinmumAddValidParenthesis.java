package suba.stackqueueproblem;

import java.util.Stack;

public class MinmumAddValidParenthesis {

	public static void main(String[] args) {

		String a = "(())))";
		Stack<Character> s = new Stack<>();

		//int count = 0;
		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == ')') {
				if (!s.isEmpty() && s.peek() == '(') {
					// System.out.println(") and peek is (");
					s.pop();
				} else {
					// System.out.println(") and peek is not (");

					s.push(a.charAt(i));
					// System.out.println(") and peek is not (" + s.peek());

				}
			}

			else {
				s.push(a.charAt(i));

			}

			// Instead of this we can return stack size
			/*
			 * if (i == a.length() - 1 && !s.isEmpty()) {
			 * 
			 * while (!s.isEmpty()) { s.pop(); count++; }
			 * 
			 * }
			 */

		}

		System.out.println(s.size());

	}

}
