package com4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tut1 {
	String model;
	String company;
	String number;
	Tut1(String model) {
	this.model = model;
	}
	double weight;
	void makeCall(String number) {
	this.number = number;
	}
	void receiveCall() {
	System.out.println("i hava recieved call");
	}
	
//	int i = 42;
//	String s = (i<40)?"life":(i>50)?"universe":"everything";
//	System.out.println(s);
	public static void main(String[] args) {

//		int i = 42;
//	String s = (i<40)?"life":(i>50)?"universe":"everything";
//	System.out.println(s);
		
//		for(int i = 2; i < 4; i++)
//			for(int j = 2; j < 4; j++)
//			if(i < j)
//			assert i!=j : i;
//		int x =5;
//		
//		x *= 3 + 7;
//		
//		System.out.println(x);
		
//		int x = total(1,2,3,4,5);
//		System.out.println(x);
//		
//		
//	}
//	public static int total(int ... array) {
//		int sum = 0;
//		for(int number : array) {
//		sum+=number;
//		}
//		return sum;
//		}
//		
//			String s = "string 1";
//			int i = 5;
//			someMethod1(i);
//			System.out.println(i);
//			someMethod2(s);
//			System.out.println(s);
//			}
//	
//		public static void someMethod1(int i) {
//		System.out.println(++i);
//		}
//		public static void someMethod2(String s) {
//		s = "string 2";
//		System.out.println(s);
//		}
//		}
//		int a[] =  {1,2,3,4,5,6};
//		int i = a.length-1;
//		
//		while(i >= 1) {
//			System.out.println(a[i]);
//			i--;
//		}
		
//		int i = 0, j = 10;
//		
//		try {
//			
//			j/= i;
//			
//		}
//		catch(Exception e) {
//			System.out.println("any number can "
//					+ "not be divided by zero"
//					+ " in math");
		
		Tut1 t = new Tut1("4657869");
		t.makeCall("76879585");
		t.receiveCall();
		}
		
		
		
	}
			
