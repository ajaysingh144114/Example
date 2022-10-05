package com;
import java.util.*;
public class Tut90 {

	public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x =1;
		while(x <=10) {
			int m = x  *  num;
			System.out.println(num  +" x "+  x  +" = "  + m);
			x++;
		}
			
		

	}

}
