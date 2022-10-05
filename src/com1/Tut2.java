package com1;

import java.util.Arrays;

public class Tut2 {

		public static String reverseWords(String s) {
			
			String [] words = s.split(" ");
		
			String rev = "";
			
			for(int i = words.length-1; i>= 0; i--) {
				if(words[i].trim().length()!= 0) {
					rev += words[i]+" ";
					
				}
				rev.trim();
			}
			return rev;
			
		}
		
		public static void main(String args[]) {
			
			
	
		
		System.out.println(reverseWords(" my name is ajay singh "));

	}

}
