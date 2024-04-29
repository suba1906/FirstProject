package suba.stackqueueproblem;

import java.util.Stack;

public class ArithmeticExpression {
	static int n = 0;

	public static void main(String[] args) {

		// String a = "((2+3)*(5/2))";

		String a = "(3*(5+2)*(10-7))";

		Stack<Integer> si = new Stack<>();
		Stack<Character> sc = new Stack<>();
		for (int i = 0; i < a.length(); i++) {

			char ch = a.charAt(i);
			// System.out.println(ch - '0');
			if (Character.isDigit(ch)) {

				// int digit = 0;
				StringBuilder digit = new StringBuilder();
				while (i < a.length() - 1 && Character.isDigit(a.charAt(i))) {
					digit.append(a.charAt(i++));
					// System.out.println(digit);
				}
				si.push(Integer.parseInt(String.valueOf(digit)));
				// System.out.println("digit" + digit);

				i--;

			} else if (ch == '(') {
				sc.push(ch);

			} else if (ch == ')') {
				while (sc.peek() != '(') {
					si.push(addvalue(si.pop(), si.pop(), sc.pop()));

				}
				sc.pop();

			} else {
				while (!sc.isEmpty() && setPriority(ch) <= setPriority(sc.peek())) {
					si.push(addvalue(si.pop(), si.pop(), sc.pop()));
				}

				sc.push(ch);

			}
		}

		while (!sc.isEmpty())
			si.push(addvalue(si.pop(), si.pop(), sc.pop()));

		System.out.println(si.peek());

	}

	public static int setPriority(char c)

	{
		if (c == '^')
			return 3;
		else if (c == '*' || c == '/')
			return 2;
		else if (c == '+' || c == '-')
			return 1;

		return 0;

	}

	private static Integer addvalue(Integer a, Integer b, Character ch) {

		if (ch == '+') {
			// System.out.println("+ " + (a + b));

			return b + a;
		} else if (ch == '-') {
			// System.out.println("- " + (b - a));

			return b - a;

		} else if (ch == '*') {
			// System.out.println("* " + (a * b));

			return b * a;
		} else {
			// System.out.println("/ " + b / a);

			return b / a;
		}

	}

}
