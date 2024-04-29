package suba.linkedlistproblem;

import java.io.IOException;

public class InsertNodeIndex {

	static class Node {
		public int data;
		public Node next;

		public Node(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class LinkedList {
		public Node head;

		public LinkedList() {
			this.head = null;
		}

		public static void printSinglyLinkedList(Node node, String sep) throws IOException {
			while (node != null) {
				System.out.print(String.valueOf(node.data) + sep);
				node = node.next;
			}
		}

		public static void main(String[] args) throws IOException {

			LinkedList llist = new LinkedList();
			llist.insertNode(80);
			llist.insertNode(70);
			llist.insertNode(60);
			llist.insertNode(50);
			llist.insertNode(40);
			llist.insertNode(30);
			llist.insertNode(20);
			llist.insertNode(10);

			System.out.println("Given linked list:");
			// printSinglyLinkedList(llist.head, " ");

			System.out.println();
			System.out.println("Reversed Linked list:");
			int index = 2;
			int value = 25;
			llist.head = llist.insert(llist.head, value, index);
			printSinglyLinkedList(llist.head, " ");
		}

		Node insert(Node head, int value, int index) {

			if (head == null)
				return head;

			if (index == 1) {
				Node newnode = new Node(value);
				Node temp = head.next;
				head.next = newnode;
				newnode.next = temp;
				return head;

			}

			return insert(head.next, value, --index);

		}

		public void insertNode(int nodeData) {
			Node node = new Node(nodeData);

			if (this.head != null) {
				node.next = head;
			}
			this.head = node;
		}
	}

}
