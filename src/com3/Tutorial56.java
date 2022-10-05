package com3;

import java.util.*;
import java.io.*;
public class Tutorial56 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader =new BufferedReader( new InputStreamReader(System.in))
	;	
		
		System.out.println("enter the string");
		
		String word = reader.readLine();
		
		int len = word.length();
		
		String empty ="";
		
		for(int i = len-1 ; i>=0; i--) {
			
			char ch = word.charAt(i);
			
		empty+= ch;	
		}
		
		System.out.println("reverse word = " + empty);
		
	}

}
