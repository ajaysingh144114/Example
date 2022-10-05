package com6;


import java.util.*;

public class Dsa6 {

	public static boolean isPrime(int num ) {
		
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				
				count++;
				
			}
			
		}
		
		if(count == 2) 
			return true;
		return false;
			
		
	}
	
	public static int reverse(int num) {
		int rev =  0;
		while(num > 0) {
			
			int rem = num % 10;
			 rev = rev * 10 + rem;
			 num /= 10;
			 
			
			
		}
		
		return rev;
		
	}
	
	
	public static boolean isAdam(int num) {
		
		
		int squOfNum= num * num;
		int revNum = reverse(num);
		int squOfrevNum = revNum * revNum;
		if(squOfNum == reverse(squOfrevNum)) {
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	public static void main(String[] args) {

		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the number");
	
		
	int m = sc.nextInt();
	
	
	int n = sc.nextInt();
	
	if (m >= n) {
		
		System.out.println("INVALID INPUT");
		return;
	}
	System.out.println("PRIME-ADAM INTEGER ARE :");
	
	int count = 0;
	for (int i = m; i <=n; i++) {
		if(isPrime(i) &&(isAdam(i))){
			System.out.print(i+ " ");
			count++;
			
		}
		
	}
	 if (count == 0 ) {
         System.out.print("NIL");
     }
     
     System.out.println();
     System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS: " + count);
	}
}
