package bank;

public class SinglyLinkedList{
	Node head;
	class Node{
		
		int data ;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void addLast(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}
		Node temp = head;
		 while(temp.next != null) {
			 temp = temp.next;
		 }
		 
		temp.next=node;
		
	}
	void Display() {
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "--->");
			temp = temp.next;
			
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addLast(6);
		list.addLast(9);
		list.addLast(12);
		list.addLast(13);
		list.addLast(78);
		list.Display();
	}

}
