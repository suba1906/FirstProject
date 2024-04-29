package suba.stackqueueproblem;

import java.util.Stack;

public class ParanthesisValidation {

	public static void main(String[] args) {

		String a = "({[]})";

		Stack<Character> s = new Stack<>();

		for (int i = 0; i < a.length(); i++) {
			// System.out.println("Starting" + a.charAt(i));
			if (a.charAt(i) == ']' || a.charAt(i) == '}' || a.charAt(i) == ')') {
				if ((a.charAt(i) == ']' && s.peek() == '[') || (a.charAt(i) == '}' && s.peek() == '{')
						|| (a.charAt(i) == ')' && s.peek() == '(')) {
					s.pop();
					continue;

				} else {
					System.out.println("false" + "  " + a.charAt(i));
					break;
				}

			}

			s.push(a.charAt(i));

		}

		System.out.println("true");
	}

}
