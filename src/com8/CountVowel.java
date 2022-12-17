package com8;
import java.util.*;
public class CountVowel {

	String str;
	int freq;
	
	CountVowel(){
		str = null;
		freq=0;
	}
	void read_words() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		 str = sc.nextLine().toUpperCase();
	}
	void vowelCount() {
		String arr[] = str.split("[ ]");
		String k = "";
		
		for (String string : arr) {
			char ch = string.charAt(0);
			if(ch == 'A'|| ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U') {
				freq++;
			}
		}
			System.out.println(freq);
		
	}
	public static void main(String[] args) {
		
		CountVowel c = new CountVowel();
		
		c.read_words();
		
		c.vowelCount();
	}
}
