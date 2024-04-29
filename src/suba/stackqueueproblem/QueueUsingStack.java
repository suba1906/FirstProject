package suba.stackqueueproblem;

import java.util.Stack;

public class QueueUsingStack {
	private static final int defaultSize = 5;

	CustomStack firststack;
	CustomStack secondStack;

	protected int data[];
	int ptr = -1;

	public QueueUsingStack() {
		firststack = new CustomStack();
		secondStack = new CustomStack();

	}

	// push --> Adding the value

	public boolean push(int item) {
		// ptr++;

		return firststack.push(item);
	}

	// If asked to remove efficiently then use two stack at push ,instead of pop
	public int pop() throws Exception {
		// ptr++;

		while (!firststack.empty()) {
			secondStack.push(firststack.pop());
		}
		int removed = secondStack.pop();

		while (!secondStack.empty()) {
			firststack.push(secondStack.pop());
		}

		return removed;

	}

	public int peek() throws Exception {
		// ptr++;

		if (firststack.empty()) {
			throw new Exception("Stack is empty");

		}

		while (!firststack.empty()) {
			secondStack.push(firststack.pop());
		}
		int first = secondStack.peek();

		while (!secondStack.empty()) {
			firststack.push(secondStack.pop());
		}

		return first;

	}

}
