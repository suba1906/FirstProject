package suba.linkedlistproblem;

import java.io.IOException;
import java.util.LinkedList;

import suba.linkedlistproblem.InsertNodeIndex.Node;

public class MergeDoublyLL {

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
			printSinglyLinkedList(llist.head, " ");

			System.out.println();
			System.out.println("Reversed Linked list:");
			int index = 7, value = 25;

			Node prev = null;
			int left = 2, right = 5, dex = 1;
			// llist.head = llist.reorder(llist.head);
			llist.head = llist.reverseKthSkipKth(llist.head);

			System.out.println("Reversed Linked list:");
			printSinglyLinkedList(llist.head, " ");
		}

		private Node reverseKth(Node head) {
			int k = 3;

			if (k < 1 || head == null)
				return head;

			Node cur = head;
			// Node last =null,next =null , prev=null;
			Node next = null, prev = null;
			// Node temp = cur;
			while (cur != null)

			{
				Node temp = cur;
				Node last = prev;

				for (int i = 0; cur != null && i < k; i++) {
					System.out.println("cur in loop" + cur.data);
					next = cur.next;
					cur.next = prev;
					prev = cur;
					cur = next;

				}

				if (last != null) {
					System.out.println("last is not null" + last.data);
					System.out.println("prev" + prev.data);

					last.next = prev;
				} else {
					System.out.println("last is  null");

					head = prev;
					// last = temp;
				}

				temp.next = cur;
				prev = temp;

			}
			return head;
		}

		private Node reverseKthSkipKth(Node head) {
			int k = 3;

			if (k < 1 || head == null)
				return head;

			Node cur = head;
			// Node last =null,next =null , prev=null;
			Node next = null, prev = null;
			// Node temp = cur;
			while (cur != null)

			{
				Node temp = cur;
				Node last = prev;

				for (int i = 0; cur != null && i < k; i++) {
					System.out.println("cur in loop" + cur.data);
					next = cur.next;
					cur.next = prev;
					prev = cur;
					cur = next;

				}

				if (last != null) {
					System.out.println("last is not null" + last.data);
					System.out.println("prev" + prev.data);

					last.next = prev;
				} else {
					System.out.println("last is  null");

					head = prev;
					// last = temp;
				}

				temp.next = cur;
				for (int i = 0; cur != null && i < k; i++) {
					prev = cur;
					cur = cur.next;

				}

			}
			return head;
		}

		Node reorder(Node head) {

			if (head == null || head.next == null)
				return head;

			Node mid = findmide(head);
			Node reverse = reverse(mid);

			Node reorder = head;
			while (reorder != null && reverse != null) {
				// System.out.println("reorder" + reorder + " revrse" + reverse);
				Node temp = reorder.next;
				Node reverseTemp = reverse.next;

				reorder.next = reverse;
				reverse.next = temp;

				reorder = temp;
				reverse = reverseTemp;

			}

			// This u havent think
			if (reorder != null)
				reorder.next = null;
			return head;

		}

		private Node reverse(Node head) {

			Node next = null, prev = null;

			Node cur = head;

			while (cur != null) {
				next = cur.next;
				cur.next = prev;
				prev = cur;
				cur = next;
			}
			return prev;
		}

		private Node findmide(Node head) {

			Node fast = head;
			Node slow = head;

			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}

			return slow;
		}

		Node insert(Node head, int value, int index) {

			if (head == null)
				return head;

			if (index == 1) {
				Node newnode = new Node(value);

				newnode.next = head;
				return newnode;

			}

			head.next = insert(head.next, value, --index);
			return head;

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
