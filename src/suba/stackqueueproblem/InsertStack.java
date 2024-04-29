package suba.stackqueueproblem;

import java.util.Stack;

public class InsertStack {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();

		s.push(3);
		s.push(2);
		s.push(1);
		s.push(7);
		s.push(6);

		insert(s, 4);
		System.out.println(s);
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
