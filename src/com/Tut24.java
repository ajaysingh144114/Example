package com;

import java.util.*;

public class Tut24 {

	public static void main(String args[]) {
		
	
		Random rand = new Random();
		int a[] = new int[4];
		
		for(int i = 0; i<a.length ; i++) {
			
			a[i]= rand.nextInt(20);
			
			System.out.println(a[i]);
		}
		int min = 0;
		int max = 0;
		for(int i = 0 ; i<a.length ; i++) {
			min = a[0];
			
			if(min > a[i]) {
				min = a[i];
			}
		
	
		}
		
		System.out.println("minimum is");
		System.out.println(min);
		
		
	}
	
	
	
}
