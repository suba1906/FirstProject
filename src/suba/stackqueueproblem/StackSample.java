package suba.stackqueueproblem;

import java.util.Stack;

public class StackSample {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(3);
		s.push(4);
		s.push(6);
		s.push(7);
		s.push(8);

		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

		System.out.println("-----------------------------------");

		System.out.println("--------Custom Stack  starts-------");
		CustomStack custom = new CustomStack();
		custom.push(1);
		custom.push(3);
		custom.push(4);
		custom.push(6);
		custom.push(7);
		custom.push(8);
		custom.push(11);
		custom.push(13);
		custom.push(14);
		custom.push(16);
		custom.push(17);
		custom.push(18);

		try {
			System.out.println(custom.peek());

			System.out.println(custom.pop());
			System.out.println(custom.pop());
			System.out.println(custom.pop());
			System.out.println(custom.pop());
			System.out.println(custom.peek());

			System.out.println(custom.pop());

			System.out.println(custom.pop());
			System.out.println(custom.peek());

			System.out.println(custom.pop());
			System.out.println(custom.pop());
			System.out.println(custom.pop());
			System.out.println(custom.pop());
			System.out.println(custom.peek());
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
