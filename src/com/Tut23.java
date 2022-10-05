package com;

import java.util.*;

public class Tut23 {

	
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		int[] a = new int[6];
		
		
		for(int i = 0; i< a.length; i++) {
			
			a[i]= rand.nextInt(30);
			
			System.out.println(a[i]);
			
		}
		
		
		for(int i = 0; i < a.length-1 ; i++) {
			int min = a[i];
			
			for(int j = i+1; j < a.length-1 ; j++) {
				
				if(min > a[j]) {
					min = a[j];
				}
			}
			min = a[i+1];
			
			
		}
		
		System.out.println("after the sorting");
		
	for(int i = 0; i< a.length; i++) {
			
		
			
			System.out.println(a[i]);
			
		}
	}
	
}
