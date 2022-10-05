package com1;

public class tuto89 {

	public static void main(String[] args) {
		
			int num[] = {
				1,2,3,4,5,6,7,8,9,10,11,12,14
			};
			int len = num.length;
			int n = num[len-1];
			
			int sum1= (n * (n + 1))/2;
			int sum = 0;
			for(int i = 0; i<num.length ; i++) {
				
				sum += num[i];
			}
			System.out.println(sum);
		int k = sum1 - sum;
		
		System.out.println("missing the number = " + k);
		
	}

}
