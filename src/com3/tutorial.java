package com3;
import java.util.*;
public class tutorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		long num = sc.nextInt();
		long count = 0;
		for(long i = 1; i<=num ; i++) {
			if(num % i== 0) {
				
				count++;
			}
		}
		if(count == 2) {
			System.out.println("it is the prime number ");
			
		
		}
		else {
			System.out.println("it is not the prime number");
		}
	}

}
