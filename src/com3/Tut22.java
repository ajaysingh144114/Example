package com3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut22 {

	public static void main(String[] args) throws IOException {
		
	//121
		//-121
		//palindrome number
		
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
System.out.println("enter the number ");


String num = reader.readLine();


int num1 = Integer.parseInt(num);
int num2 = num1;

int sum = 0;
while(num1 > 0) {
	int lastDigit = num1 % 10;
	
	sum = sum *10 + lastDigit;
	
	num1/= 10;
	
}
System.out.println();
if(sum == num2) {
	System.out.println("it is the palindrome number ");
}
else {
	System.out.println("it is not the palindrome number");
}

	}

}
