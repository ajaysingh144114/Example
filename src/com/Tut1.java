package com;

import java.util.Arrays;

public class Tut1 {

	public static void main(String[] args) {
		
		int x []= { 56,78,8,2,5,1,3};
		
		int l = x.length;
		System.out.println(Arrays.toString(x));
		for(int i = 0; i< x.length-1 ; i++) {
			for(int j = 0; j< x.length-1 ; j++) {
				if(x[j] > x[j+1]) {
					
					int temp = x[j];
					x[j]=x[j+1];
					x[j+1]= temp;
				}
			}
		}
System.out.println(Arrays.toString(x));
	}

}
