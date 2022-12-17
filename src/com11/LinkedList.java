package com11;


public class LinkedList {

	Node head;
	
	public class Node{
		String data ;
		Node next;
	
	Node(String data){
		this.data = data;
		this.next = null;
	}
	}
	public void addfirst(String data) {
		Node node=new Node(data);
		
		if(head == null) {
			head = node;
			return ;
		}
		
		node.next = head;
		head = node;
	}
		
		public void addlast(String data) {
			Node node = new Node(data);
			if(head == null) {
				head = node;
				return ;
			}
			Node current = head;
			
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
		
	public void printList() {
		if(head == null) {
			System.out.println("list is empty");
		}
		Node current = head;
		
		while(current != null) {
			System.out.print(current.data + "---->");
			current = current.next;
		}
	System.out.println("null");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		LinkedList l =new LinkedList();
		
		l.addfirst("ajay");
		l.addfirst("mohan");
		l.printList();
		l.addlast("ragav");
		l.addlast("rajiv");
		l.printList();
	
	
	}
}
