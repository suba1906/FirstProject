package suba.stackqueueproblem;

public class CustomQueue {

	private static final int defaultSize = 5;

	protected int data[];
	int ptr = 0;

	public CustomQueue() {
		this(defaultSize);
	}

	public CustomQueue(int size) {
		data = new int[size];
	}

	public boolean push(int item) {
		// ptr++;

		if (full()) {
			System.out.println("Stack is full , cannot  insert item " + item);
			return false;

		}

		data[ptr++] = item;

		return true;
	}

	private boolean empty() {
		// TODO Auto-generated method stub
		return ptr == 0;
	}

	public int pop() throws Exception {
		// ptr++;

		if (empty()) {
			throw new Exception("Stack is empty");

		}
		int removed = data[0];

		for (int i = 1; i < ptr; i++) {
			data[i - 1] = data[i];
		}
		ptr--;

		return removed;

	}

	private boolean full() {

		return ptr == data.length - 1;
	}
}
