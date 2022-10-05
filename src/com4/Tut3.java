package com4;

import java.util.*;

public class Tut3 {
//finding the minimum in the array
	public static void main(String[] args) {
		
		int arr[] = new int[5]	;


	Scanner sc = new Scanner(System.in);
	
System.out.println("enter the elements");


for(int i = 0; i< arr.length; i++) {

	arr[i]= sc.nextInt();
}
	
	int min = arr[0];
	int max = arr[0];
	
	for(int i = 0; i< arr.length; i++) {
		if(arr[i]< min) {
			min = arr[i];
		}
		else if (arr[i]>max) {
			max = arr[i];
		}
	}
	System.out.println("minium element " + min);
	System.out.println("maximum element " + max);
	}
}
