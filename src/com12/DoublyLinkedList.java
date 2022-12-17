package com12;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int length;
	class Node{
		int data;
		Node next;
		Node previous;
		
		Node(int data){
			this.data=data;
		}
	}
	DoublyLinkedList(){
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	public void displayForward() {
		if(head == null) {
		return;
		}
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+"--->");
			temp  = temp.next;
		}
		System.out.println("null");
		
	}
	public void displayBackward() {
		if(tail == null) {
			return;
		}
		Node temp  = tail;
		
		while(temp != null) {
			System.out.print(temp.data + "--->");
			temp = temp.previous;
		}
		System.out.println("null");
	}
	public void addFirst(int data) {
		Node node = new Node(data);
		
		
		if(head == null && tail == null) {
			head = node;
			tail = node;
			return;
		}
		else {
			head.previous=node;
		}
		node.next=head;
		head = node;
		
		
		
	}
	public void addMiddle(int data) {
		Node node = new Node( data);
		
	int	mid = (length%2==0)?(length+1)/2 : length/2;
		if(head == null) {
			return;
		}
		Node temp = head;
		
		for (int i = 1; i <= mid; i++) {
			temp = temp.next;
		}
		node.next=temp;
		temp.previous=node;
		temp = head;
		for (int i = 1; i < mid; i++) {
			temp = temp.next;
		}
		temp.next=node;
		node.previous=temp;
	}
	public int length() {
		length=0;
		Node temp = head;
		while(temp != null) {
			length++;
			temp  = temp.next;
		}
		return length;
		
	}
	public static void main(String[] args) {
		
		
		DoublyLinkedList l = new DoublyLinkedList();
		l.addFirst(1);
		l.addFirst(2);
		l.addFirst(3);
		l.addFirst(4);
		l.addFirst(5);
		l.addFirst(89);
		l.displayForward();
		l.length();
		l.addMiddle(56);
		l.displayForward();
	}
	
}
