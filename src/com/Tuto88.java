package com;

public class Tuto88 {

	static boolean isTrue(int n) {
		int c = 0;
		for(int i = 1; i<=n ;i++) {
			if(n % i == 0) 
				c++;
			
		}
		if(c == 2)
			return true;
		else
			return false;
		}
		
	

		
		
	
	
	public static void main(String[] args) {
	boolean x =isTrue(15);
	System.out.println(x);
	}

}
