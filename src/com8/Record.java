package com8;

import java.util.*;

public class Record {

	 protected String[] names;
	    protected int[] marks;
	    protected int size;
	
	    Record (int cap) {
	        this.size = cap;
	        names = new String[size];
	        marks = new int[size];
	        }
	 public void readArray() {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the details of the students:");
	        for(int i=0;i<size;i++) {
	           
	                System.out.println("Enter the name of the "+(i+1)+"st student:");
	                names[i] = input.next();
	                System.out.println("Enter the marks of the "+(i+1)+"st student:");
	                marks[i] = input.nextInt();
	            }
	    }
	protected void display() {
        System.out.println("Entered details are as follows:");
        for(int i = 0; i < size; i++) {
            System.out.println(names[i]+" has obtained "+marks[i]+" marks.");
        }
    }
		
	}

