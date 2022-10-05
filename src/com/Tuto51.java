package com;
import java.util.*;
public class Tuto51 {
//write a program in java ot input a character.find
	//and display the next 10th character in the ASCII
	//code
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the letter");
		char ch = sc.next().charAt(0);
		char nextch = (char) (ch + 10);
		System.out.println("tenth character from" + ch + "is "+ nextch);
		
	}
	
}
