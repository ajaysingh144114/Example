package com7;

import java.util.*;

public class Dsa22 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the integer");
		
		String word = sc.nextLine();
		
		
		System.out.println(word);
		
		if(word.charAt(word.length()-1)!= '.'
				&& word.charAt(word.length()-1)!= ','
				&& word.charAt(word.length()-1)!= '?'
				&&
				word.charAt(word.length()-1)!= '!') {
			System.out.println("INVALID INPUT");
			return;
		}
		
		String[] senten = word.split("[.?!, ]");
		
		for (int i = 0; i < senten.length; i++) {
			for (int j = 0; j < senten.length-1; j++) {
		if(senten[j].length()> senten[j+1].length()) {
			String temp = senten[j];
			senten[j] = senten[j+1];
			senten[j+1]= temp;
		}
		if(senten[j].length()== senten[j+1].length() && 
				(senten[j].compareTo(senten[j+1])> 0)) {
			String temp = senten[j];
			senten[j] = senten[j+1];
			senten[j+1]= temp;
		}
	
	}
			}
		

		
for (int i = 0; i < senten.length; i++) {
	System.out.print(senten[i]+" ");
}		
	}
	
}
