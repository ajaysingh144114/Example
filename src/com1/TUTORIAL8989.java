package com1;

public class TUTORIAL8989 {
	public static void main(String[] args) {
		long num = 8364898798789567678L;
				
		long sum = 0;
		while(num != 0) {
			long rem = num % 10;
			sum = sum *10 + rem;
			num/=10;
		}
		System.out.println(sum);
	}
}
