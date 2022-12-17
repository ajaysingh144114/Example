package com9;


public class LinkedList {

 Node head;
	
	
	
	public  void insert(int data) {
		
		Node node = new Node();
		
		node.data=data;
		
		node.next = null;
		
		if(head==null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			
		n.next = node;
		}
		
		
	}
	public int delete( int n) {
		
		Node node= new Node();
		node.data=n;
		
	while(head.next != null && head.data == n) {
		head = head.next;
		if(head.data == n) {
			Node temp = head;
			Node temp2 = head.next;
			temp2 = temp2.next;
		}
	}
		
		return n;
		
		
	}

	public  void show(){
		
		Node node = head;
		
		while(node.next != null) {
			System.out.println(node.data);
			node  = node.next;
		}
		
		System.out.println(node.data);
	}
	
}
