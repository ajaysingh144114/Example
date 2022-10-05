package com7;


import java.util.*;


public class Dsa1 {

	public static int[][] printArray(int num[][]){
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				for (int j2 = 0; j2 < num[i].length-1; j2++) {
					if(num[i][j2]>num[i][j2+1]) {
						int temp = num[i][j2];
						num[i][j2]= num[i][j2+1];
						num[i][j2+1]= temp;
						
						}
				}

				}
			}
		
		return num;
		}
		
		
		
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
				
				
		int n = sc.nextInt();
		
		Random rand = new Random();
		
		int[][] arr = new int[m][n];
		
		
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
		 arr[i][j]= rand.nextInt(30);
		}
	}
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			
			System.out.print(arr[i][j]+ "\t");
		}
		System.out.println();
	}
	
	printArray(arr);
	
	System.out.println("---------------------------");

	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			
			System.out.print(arr[i][j]+ "\t");
		}
		System.out.println();
	}
	
	}
}
