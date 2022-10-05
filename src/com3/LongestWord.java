package com3;

import java.util.*;

public class LongestWord {

	public static void main(String[] args) {
		
	String word = "my name is ajay singhaaa".trim()	;
	String word2[] = word.split(" ");
	int len = word2.length;
	String m = "";
	int len1= 0;
	int i ;
		for( i = 0; i< len; i++) {
			
			m +=  word2[i];
	 len1 = m.length();
		int [] prince = {len1} ;
	
			
		}
		System.out.println(len1);
		}
	
	}


