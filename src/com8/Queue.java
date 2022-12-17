package com8;

import java.util.*;


public class Queue {
	int que[] = new int[100];
	int capcity;
	int front ;
	int rear;
	
	public 	Queue() {
		for (int i = 0; i < que.length; i++) {
			que[i]=0;
		}
	}
	public Queue(int cap) {
		capcity = cap;
		front = 0;
		rear = -1;
	}
	void push(int val) {
		if(rear ==capcity-1) {
			System.out.println("stack overflow");
		}
		else {
			rear++;
			
			que[rear]= val;
			capcity++;
		}
	}
	int pop() {
		int temp = 0;
		if(rear == -1) {
			System.out.println("stack undeflow");
		}
		else {
			 temp = que[front];
			front = front+1;
			capcity--;
			
		}
		return temp;
	}
	void queueDisplay() {
		for (int i =front; i <rear; i++) {
			System.out.println(que[i]);
		}
	}
	public static void main(String[] args) {
	
		Queue queue = new Queue();
		queue.push(56);
		queue.push(23);
		queue.push(89);
		queue.push(12);
		queue.queueDisplay();
		
	}
	
	
	
}
