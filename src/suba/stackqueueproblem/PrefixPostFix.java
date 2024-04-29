package suba.stackqueueproblem;

import java.util.Stack;

public class PrefixPostFix {

	public static void main(String[] args) {

		String a = "*+AB-CD";

		Stack<String> s = new Stack<>();
		for (int i = a.length() - 1; i >= 0; i--) {
			char ch = a.charAt(i);
			//System.out.println(ch);
			if (Character.isAlphabetic(ch))
				s.push(ch + "");
			else {

				String op1 = s.isEmpty() ? "" : s.pop();
				String op2 = s.isEmpty() ? "" : s.pop();

				String temp = op1 + op2 + ch;
				s.push(temp);
			}

		}

		System.out.println(s.peek());
	}

}
