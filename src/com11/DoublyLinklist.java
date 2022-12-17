package com11;

public class DoublyLinklist {
	Node head;
	Node tail;
	int length;

	private class Node {
		int data;
		Node next;
		Node previous;

		Node(int data) {
			this.data = data;

		}

	}

	DoublyLinklist() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public void displayForward() {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null) {

			System.out.print(temp.data + "---->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void displaybackward() {
		if (tail == null) {
			return;
		}
		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.data + "---->");
			temp = temp.previous;
		}
		System.out.println("null");
	}

	public void addFirst(int data) {
		Node node = new Node(data);

		if (tail == null && head == null) {
			tail = node;
			head = node;
			return;
		} else {
			head.previous = node;
		}

		node.next = head;
		head = node;

	}

	public void addMiddle(int data) {

		Node node = new Node(data);

		int mid = (length % 2 == 0) ? length / 2 : (length + 1) / 2;
		Node temp = head;

		for (int i = 1; i <= mid; i++) {
			temp = temp.next;

		}
		node.next = temp;

		temp.previous = node;
		temp = head;
		for (int i = 1; i < mid; i++) {
			temp = temp.next;

		}
		temp.next = node;
		node.previous = temp;

	}

	public void inserAnyIndex(int data, int l) {

		int mid = l;

		Node node = new Node(data);
		if (mid == length) {
			System.out.println("please enter the index number less than length");
			return;
		}
		if (l == 0) {
			if (tail == null && head == null) {
				tail = node;
				head = node;
				return;
			} else {
				head.previous = node;
			}

			node.next = head;
			head = node;
		} else if (l != 0 && l != length - 1) {
			Node temp = head;

			temp = head;
			for (int i = 1; i <= mid; i++) {
				temp = temp.next;

			}
			node.next = temp;
			temp.previous = node;
			temp = head;
			for (int i = 1; i < mid; i++) {
				temp = temp.next;

			}
			temp.next = node;
			node.previous = temp;

		}

	}

	public int length() {
		length = 0;
		Node temp = head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinklist l = new DoublyLinklist();

		l.addFirst(67);
		l.addFirst(98);
		l.addFirst(234);
		l.addFirst(45);
		l.addFirst(90);
		l.displayForward();
		l.length();
		l.addMiddle(56);
		l.displayForward();

	}

}
