package com;

public class Tuto18 {

	public static void main(String args[]) {
		 int c = 0, d = 50, e = 50;
	        boolean b = (c == 1) && (++e < 100);
	        System.out.println("e = " + b);
	        boolean f = (++e < 100) && (c == 1);
	        System.out.println("e = " + f);
	        
	        
	        
	        double d1 = 21.5;
	        double d2 = 0.5;

	        boolean condition = ( d1 / d2 ) < 15;

	        int result = condition ? 77 : 99;

	        System.out.println("result = " + result);
	}
	
}
