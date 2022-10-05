
package com7;

import java.util.*;

public class Dsa8 {
	
	public static int[] printArray(int num[]) {
		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length-1; j++) {
				if(num[j] > num[j+1]) {
					
					int temp = num[j];
					
					num[j] = num[j+1];
					
					num[j+1] = temp;
							
						}
			}
		
		}
		return num;
		
	}

	

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
				
				
		
		Random rand = new Random();
		
		int[] arr = new int[m];
		
		
	for (int i = 0; i <arr.length; i++) {
		
		 arr[i]= rand.nextInt(30);
		}
	
	
	for (int i = 0; i < arr.length; i++) {
		
		System.out.print(arr[i]+ ", ");
	}
		
	printArray(arr);
	
	
System.out.println("after the sorting");


	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+ " , ");
	}
	
	}
	
}
