package com3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut20 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the number");
		
		String num = reader.readLine();
		
		int n = Integer.parseInt(num,2);
		
		System.out.println(n);
		
		
	
		
	
	}

}
