package com;

public class Tuto67 {

	
	public static void main(String[] args) {
		String city= "Banglore";
		String str = "0123456789";
		int t = city.length();
		int CT = 200-t;
		System.out.println(Integer.toString(t)+Integer.toString(CT));
		String x = str.substring(8);
		System.out.println(CT + Integer.parseInt(x));
	}
	
}
