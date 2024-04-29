package suba.linkedlistproblem;

import java.util.LinkedList;

public class TraversalLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		for (Integer i : list) {
			System.out.println(i);
		}
	}

}
