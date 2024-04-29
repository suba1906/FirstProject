package suba.stackqueueproblem;

public class CustomStack {

	private static final int defaultSize = 5;

	protected int data[];
	int ptr = -1;

	public CustomStack() {
		this(defaultSize);
	}

	public CustomStack(int size) {
		data = new int[size];
	}

	// push --> Adding the value

	public boolean push(int item) {
		// ptr++;

		if (full()) {
			System.out.println("Stack is full , cannot  insert item " + item);
			return false;

		}

		data[++ptr] = item;

		return true;
	}

	public int pop() throws Exception {
		// ptr++;

		if (empty()) {
			throw new Exception("Stack is empty");

		}

		return data[ptr--];

	}

	public int peek() throws Exception {
		// ptr++;

		if (empty()) {
			throw new Exception("Stack is empty");

		}

		return data[ptr];

	}

	public boolean empty() {
		// TODO Auto-generated method stub
		return ptr == -1;
	}

	private boolean full() {

		if (ptr == data.length - 1) {
			int newData[] = new int[data.length + 10];

			for (int i = 0; i < data.length; i++) {
				// System.out.println("old value");

				newData[i] = data[i];
			}

			data = newData;

		}
		return false;
	}

}
