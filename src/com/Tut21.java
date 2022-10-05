package com;
import java.util.*;
public class Tut21 {

	public static void main(String[] args) {

		
		Random rand = new Random();
		
	int[] a = new int[6];
	
	
	for(int i = 0; i< a.length; i++) {
		
		a[i]= rand.nextInt(30);
		
		System.out.println(a[i]);
		
	}
		
for(int i = 0; i< a.length-1; i++) {
		
	for(int j = 0 ; j< a.length-1; j++) {
		
		if(a[j]>a[j+1]) {
			
			int temp = a[j+1];
			a[j+1]= a[j];
			a[j]= temp;
		}
	}
		
	}
		
System.out.println("after the sorting the algorithm");


for(int i = 0; i< a.length; i++) {
	
	
	System.out.println(a[i]);
	
}
		
		
		
		
		
	}

}
