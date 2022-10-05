package com5;

import java.util.Scanner;

public class Dsa {

	
	public static void main(String[] args) {
		
		
		//how to reverse the any number in java 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the numer ");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num > 0) {
			
			int rem = num % 10;
			
			sum += rem;
			
			num/=10;
		}
		System.out.println(sum);
	}
	
	
	
}
