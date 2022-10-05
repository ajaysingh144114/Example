package com;

import java.util.*;

public class Tuto56 {

	
	public static void main(String[] args) {
		
		
	int n = 3;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int m = 0;
	int x[] = new int[n];
	int i ;
	
	for(i = 0; i< x.length ; i++) {
		x[i]= sc.nextInt();
		
	}
	
	for(i = 0; i< x.length ; i++) {
	m+= x[i];
		
	}
		
		System.out.println("print the number = " + m);
	}
	
	
}
