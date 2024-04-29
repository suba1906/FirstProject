package suba.stackqueueproblem;

import java.util.Stack;

public class InfixtoPostfix {
	public static void main(String[] args) {

		String a = "(3*(5+2)*(10-7))";

		String postchar = "";

		Stack<Character> s = new Stack<>();

		for (int i = 0; i < a.length(); i++) {
			// System.out.println("stack )" + s);

			char ch = a.charAt(i);
			if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
				postchar += ch;
				continue;
			}

			else if (ch == ')') {
				while (!s.isEmpty() && s.peek() != '(') {

					postchar += s.pop();

				}
				if (!s.isEmpty()) {
					s.pop();
				}
			} else if (ch == '(') {
				s.push(ch);
			}

			else if (s.isEmpty())
				s.push(ch);

			else {
				while (!s.isEmpty() && setPriority(ch) <= setPriority(s.peek())) {
					postchar += s.pop();

				}
				s.push(ch);

			}

		}
		while (!s.isEmpty())
			postchar += s.pop();

		System.out.println("postchar   --->>>  " + postchar);

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
}
