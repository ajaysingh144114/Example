package com6;

import java.util.Arrays;
import java.util.Random;

public class Dsa1 {
	
	    public static int[][] diagonalSort(int[][] mat) {
	    	
	     int n = mat.length;
	     
	        int m = mat[0].length;
	        
	       int i=0;
	       
	        for(int j=0; j<m; j++)
	        {
	            int size=Math.min(m-j, n-i);
	            
	            int arr[]= new int[size];
	           
	            for(int t=0; t<size; t++)
	            {
	                arr[t]=mat[i+t][j+t];
	            }
	            Arrays.sort(arr);
	            for(int t=0; t<size; t++)
	            {
	                mat[i+t][j+t]=arr[t];
	            }
	        }
	        int j=0;
	        for( i=1; i<n; i++)
	        {
	             int size=Math.min(m-j, n-i);
	             
	            int arr[]= new int[size];
	           
	            for(int t=0; t<size; t++)
	            {
	                arr[t]=mat[i+t][j+t];
	            }
	            Arrays.sort(arr);
	            
	            for(int t=0; t<size; t++)
	            {
	                mat[i+t][j+t]=arr[t];
	            }
	        }
	        
	        return mat;
	    }
	

	public static void main(String[] args) {
		
Random rand = new Random();
		
		
		int[][] arr = new int[3][4];
		 

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = rand.nextInt(25);
				}
			}

			int max = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}

			
			
			diagonalSort(arr);
		
		System.out.println("____________________________________");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
}
