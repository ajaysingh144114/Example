package com;

import java.util.*;
public class tutorial7878 {

	public static void main(String[] args) {
	
//		
//	   int x = 1;
//	   
//	   while(x <= 10) {
//		   int m = 2 * x;
//		   
//		   System.out.println("2 x " + x + " = " + m);
//		   x++;
//		   
//	   }
		
		
//		Random prince = new Random();
//		
//		int [] num = new int[4];
//		
//		for(int i = 0; i< num.length ; i++) {
//			num[i]= prince.nextInt(10);
//			System.out.println(num[i]);
//		}
//		int sum = 0;
//		for(int i = 0; i< num.length ; i++) {
//			sum = sum +  num[i];
//		}
//		
//		System.out.println("total sum is");
//		
//		System.out.println(sum);
//		
//		int i = 0;
//	    int sum = 0;   
//	int num []  = {5,4,3,1};
//	while(i < num.length) {
//		sum += num[i];
//		i++;
//	}
//	System.out.println("number added");
//	System.out.println(sum);

//		int i = 0;
//		int sum = 0;
//		int num [] = {5,5,5,5,5,5,5,5,5,55,55,5,5,5,5,5,};
//		while(i<num.length) {
//			sum = sum + num[i];
//			i++;
//		
//		}
//		System.out.println("sum of total number is ="+sum);
		
		
		int num = 789;
		int rev = 0;
		while(num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println(rev);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
