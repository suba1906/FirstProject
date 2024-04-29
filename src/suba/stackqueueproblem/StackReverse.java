package suba.stackqueueproblem;

import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		
		s.push(3);
		s.push(2);
		s.push(1);
		s.push(7);
		s.push(6);

		// System.out.println(s);
		System.out.println(" stack ------>" + s);

		reverse(s);
		System.out.println("reversed stack--> " + s);
	}

	static void reverse(Stack<Integer> s) {

		Stack<Integer> s1 = new Stack<>();

		if (s.isEmpty())
			return;
		int a = s.pop();

		reverse(s);

		insert(s, a);

	}

	private static void insert(Stack<Integer> s, int a) {

		if (s.isEmpty()) {
			s.push(a);
			return;
		}

		int top = s.pop();
		insert(s, a);
		s.push(top);

	}

}
