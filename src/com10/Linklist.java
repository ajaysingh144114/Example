package com10;

public class Linklist {
Node head;
	class Node{
		String data ;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void addFirst(String n) {
		
		Node newnode = new Node(n);
		if(head == null) {
			head =newnode;
			return;
		}
		newnode.next = head;
		
		head = newnode;
		
	}
	public void addLast(String n) {
		Node newnode = new Node(n);
		if(head == null) {
			head =newnode;
			return;
		}
		Node currentNode = head;
		
		while(currentNode.next!=null) {
			currentNode = currentNode.next;
		}
		currentNode.next= newnode;
	}
	public void printlist() {
		if(head == null) {
			System.out.println("linklist is empty");
		}
		Node currentNode = head;

		while(currentNode!=null) {
			System.out.print(currentNode.data + "--->");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		
		Linklist l = new Linklist();
		
		l.addFirst("ajay");
		l.addFirst("mohan");
		
		l.printlist();
		l.addLast("SACHIN");
		l.printlist();
	}
}
