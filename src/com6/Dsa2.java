package com6;

import java.util.Random;

public class Dsa2 {
	//transpose the matrix
	
	public static int[][] rotate(int [][] matrix) {
		
		 for(int i= 0 ;i<matrix.length ;i++)
	        {
	            for(int j = i ; j<matrix.length ; j++)
	            {
	                if(i!=j)
	                {
	                    int temp = matrix[i][j];
	                    matrix[i][j] = matrix[j][i];
	                    matrix[j][i] = temp;
	                }
	            }
	        }
		 for(int i =0 ;i<matrix.length ;i++)
	        {
	            for(int j=0 ;j<(matrix.length)/2 ; j++)
	            {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[i][matrix.length-j-1];
	                matrix[i][matrix.length-j-1] = temp;
	            }
	        }
		return matrix;
		
		}
		
	
	 	public static void main(String[] args) {
			
	 		
	 		Random rand = new Random();
			
			
			int[][] arr = new int[3][3];
			 

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[0].length; j++) {
						arr[i][j] = rand.nextInt(25);
					}
				}

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[0].length; j++) {
						System.out.print(arr[i][j] + "\t");
					}
					System.out.println();
				}
				 System.out.println("-----------------------------------------------");

	 	int [][] m = rotate(arr);
	 	for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}	 
}}
