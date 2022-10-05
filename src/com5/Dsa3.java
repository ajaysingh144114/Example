package com5;
import java.util.*;

public class Dsa3 {

	public static void main(String[] args) {

		
		Random rand = new Random();
		
		int [][] arr = new int[3][3];
		
		for(int i = 0; i< arr.length; i++) {
			
			for(int j = 0; j< arr.length ; j++) {
				
				arr[i][j]= rand.nextInt(100);
			}
		}
		
for(int i = 0; i< arr.length; i++) {
			
			for(int j = 0; j< arr.length ; j++) {
				
					System.out.print(arr[i][j] + " " );
			}
			
			System.out.println();
		}
		
		
	}

}
