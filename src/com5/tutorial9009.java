package com5;


import java.util.*;

public class tutorial9009 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);

String word = sc.nextLine();

int c = 0;

String m = null;
String a[] = word.split(" ");

for(String name : a) {

int len = name.length();
if(len > c) {
	c = len;
}
if(name.length() == c) {
	m = name;
}
}
	
System.out.println("longest word of sentence will be : " + m);
		
		
	}

}
