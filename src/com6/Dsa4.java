package com6;

import java.util.Scanner;

public class Dsa4 {

		
	public static void main(String[] args) {
		
 /*how to add the two digit number unless it become in one
  * digit
  */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the digit");
		
		int sum = 0;
		int num = sc.nextInt();
		
		
		while(num > 9) {
			
		 sum = num % 10 + num/10;
		 num = sum;
		}
		
		
		System.out.println(num);
		
		
		
	
	
	
	
	}
	
	
}
