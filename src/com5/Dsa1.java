package com5;

import java.util.*;

public class Dsa1 {

	public static void main(String[] args) {
		
		System.out.println(reverseWord("my name is ajay singh"));
		
	}
	
	public static String reverseWord(String s) {
	
		String m = "";
		
		for(int i = s.length()-1 ; i>= 0; i--) {
			
			char ch = s.charAt(i);
			
			m+= ch;
			
		}
		return m;
		
		
	}
}
	

