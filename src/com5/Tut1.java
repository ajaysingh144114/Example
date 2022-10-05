package com5;


import java.util.*;

public class Tut1 {

	public static void main(String[] args) {
		
		
		
		
		 
		Random rand = new Random();
		
		int [] arr = new int[5];
		
		for(int  i = 0; i< arr.length; i++ ) {
			
			arr[i]= rand.nextInt(30);
			System.out.println(arr[i]);
		}
		int min = arr[0];
		int max = arr[0];
		
for(int  i = 0; i< arr.length; i++ ) {
			
	
	if(min > arr[i]) {
		min = arr[i];
	}
	else if( max < arr[i]) {
		max = arr[i];
	}
			
		}
System.out.println("-------------");


System.out.println("maximum number is =" + max);
System.out.println("mininum number is ="+ min);
	}

}
