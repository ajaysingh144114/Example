package com;

import java.util.*;

public class Tut77 {

	
	
	//finding the number of odd integer in given range
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the first range");
		
		int num1 = sc.nextInt();
		
		
		System.out.println("enter the second number ");
		
		int num2 = sc.nextInt();
		
		
		int odd= 0;
		
		
		int even = 0;
		
		while(num1 <= num2) {
			
			if(num1 % 2 != 0) {
				
				
				odd++;
				
			}
			else if (num1 % 2== 0) {
				
				even++;
			}
			num1++;
			
		}
		
		
		System.out.println("number of odd =  " + odd);
		
		
		System.out.println("number of even = " + even);
		
	}

}
