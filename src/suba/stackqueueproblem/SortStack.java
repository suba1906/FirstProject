package suba.stackqueueproblem;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();

		s.push(3);
		s.push(2);
		s.push(1);

		Stack<Integer> so = new Stack<>();
		System.out.println(" sorted" + s);
		while (!s.isEmpty()) {
			// System.out.println("peek" + s.peek());
			arrange(so, s.pop());
		}
		System.out.println("After sorted" + so);

	}

	public static void arrange(Stack<Integer> so, int item) {
		 System.out.println("so" + so + " " + "item " + item);
		if (so.isEmpty() || so.peek() >= item) {

			// System.out.println("inside if so" + so + " " + "item " + item);
			so.push(item);
			return;
		}
		if (!so.isEmpty() && so.peek() < item) {
			// System.out.println("so.peek()" + so.peek() + " " + "item " + item);

			int a = so.pop();
			arrange(so, item);

			so.push(a);
		}
	}

}
