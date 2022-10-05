package com;

import java.util.*;
public class Tuto17 {

	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter plain text:");
	        String word = sc.nextLine();
	        int len = word.length();
	        String f = "";
	       int a ;
	        if (len <= 3 || len >= 100) {
	            System.out.println("INVALID LENGTH");
	          
	        }
	        else {
	       
	        for (int i = 0; i < len; i++) {
	            char ch = word.charAt(i);
	            if(Character.isLetter(ch) && ch >= 65) {
	            	a = ch + 13;
	            	
	            	if(Character.isUpperCase(ch) && ch >= 90 || Character.isLowerCase(ch)&& ch >= 122) {
	            		a = a -26;
	            	}
	            	ch = (char) a;
	            	System.out.print(ch);
	            	
	            	
	            }
	           f = f+ ch;
	            
	}
}
	        System.out.println();
	}
}
	

