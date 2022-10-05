package com3;
import java.util.*;
public class Wordpalindrome {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the word");
		
		
		String word = sc.nextLine();
		
		String word1 = word;
		int len = word.length()-1;
	
		
		String empty = "";
		for(int i =len; i>=0 ; i--) {
			char ch = word.charAt(i);
			System.out.println(ch);
			empty += ch;
			
		}		if(empty.equalsIgnoreCase(word1)) {
			System.out.println("it is the palindrome number");
		}
		else {
			System.out.println("it is not the palindrome number");
		}
	}

}
