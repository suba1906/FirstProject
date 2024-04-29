package suba.stackqueueproblem;

import java.util.Stack;

public class GameOfTwoStack {

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		s1.push(1);
		s1.push(6);
		s1.push(4);
		s1.push(2);
		s1.push(4);

		s2.push(5);
		s2.push(8);
		s2.push(1);
		s2.push(2);

		int maxsum = 10;

		int maxCount = twoStack(maxsum, s1, s2, 0, 0);
		System.out.println(maxCount);

	}

	private static int twoStack(int maxsum, Stack<Integer> s1, Stack<Integer> s2, int sum, int count) {
		System.out.println(s1 + " " + s2 + " count " + count + "sum" + sum);

		if (sum > maxsum) {
			return count - 1;
		}

		int leftcount = 0, rightcount = 0;
		if (!s1.isEmpty()) {
			int removed1 = s1.pop();
			leftcount = twoStack(maxsum, s1, s2, sum + removed1, count + 1);
		}
		if (!s2.isEmpty()) {
			int removed2 = s2.pop();

			rightcount = twoStack(maxsum, s1, s2, sum + removed2, count + 1);
		}
		return Math.max(leftcount, rightcount);
	}

}
