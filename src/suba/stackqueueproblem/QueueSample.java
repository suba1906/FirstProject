package suba.stackqueueproblem;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

	public static void main(String[] args) throws Exception {

		// Queue is a interface class

		Queue<Integer> q = new LinkedList<>(); // why we didnt create objectinstance for queue....bcz queue is interface
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);

		System.out.println("###############################");
		System.out.println("###############################");
		System.out.println("Queue using stack");

		/*
		 * CustomQueue cq = new CustomQueue(); cq.push(1); cq.push(2); cq.push(3);
		 * 
		 * System.out.println(cq.pop());
		 */

		QueueUsingStack qs = new QueueUsingStack();

		qs.push(1);
		qs.push(2);
		qs.push(3);
		qs.push(4);
		qs.push(5);
		qs.push(6);

		System.out.println(qs.pop());
		System.out.println(qs.peek());
		System.out.println(qs.pop());

	}

}
