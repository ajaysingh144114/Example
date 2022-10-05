package com1;

public class Tutorial100 {

	public static void main(String[] args) {
		
		int num = 25 ;
		int sum =  0;
		
		while(num != 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num /= 10;
		}
			
	}

}
