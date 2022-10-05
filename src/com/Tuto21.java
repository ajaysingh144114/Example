package com;

import java.util.Scanner;

public class Tuto21 {

	public static void sbstring() {
		String string1="acknowledge".toUpperCase();
	String	string2 ="now".toUpperCase();
		if(string1.contains(string2)) {
		System.out.println(string2 +"  is a part of acknowledge"+"\n"+ string1.indexOf("NOW"));
		}
		else {
			System.out.println("second string is not the part");
		}
	}
	public static void main(String[] args) {

sbstring();
	}
}
