package com;
import java.util.*;
import java.util.jar.Attributes.Name;
public class Tuto22 {

	public static void main(String[] args) {
		int n = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the names");
		String[] names = new String[n];
		for(int i = 0; i< names.length;i++) {
			names[i]= sc.nextLine();
		}
		for(int i = 0; i< names.length;i++) {
			int len = names[i].length();
			if(len % 2 == 0) {
				System.out.println(names[i]);
			}
		}
		
	}
	
	
}
