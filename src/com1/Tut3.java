package com1;

public class Tut3 {

	public static void main(String[] args) {
		//how to count the character in the words 
//		
//		String word = "Princethegreat";
//		
//		int len = word.length();
//		
//		System.out.println(len);
		
		
		// how to count the number of words in the given sentnece
		
		String word = "my name is prince verma";
		
		int count = 0;
		
		for(int i = 0; i<word.length();i++) {
			
			
			char ch = word.charAt(i);
			
			
			if(ch == ' ') {
				
				count++;
				
			}
		}
System.out.println(count+1);
	}

}
