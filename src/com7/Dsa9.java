package com7;
import java.util.*;

public class Dsa9 {
	
	
	public static void sortArray(int arr2[]) {
		int n = arr2.length;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
if(arr2[j]> arr2[j+1]) {
	int temp = arr2[j];
	arr2[j]= arr2[j+1];
	arr2[j+1]= arr2[j];
	
}				
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		
		int n = sc.nextInt();
		
		if(n<= 2 || n>=10) {
			System.out.println("MATRIX SIZE OUT OT RANGE");
			return;
		}
		
		int arr[] = new int[n];
		
		int [][]arr1 = new int[n][n];
		
		for(int i = 0; i<arr.length; i++) {
			
			arr[i]= sc.nextInt();
		}
for(int i = 0; i<arr.length; i++) {
			
	System.out.print(arr[i]+",");
		}
		sortArray(arr);
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				arr1[i][j]= arr[i];
			}
		}
		
		
		
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
