package com5;

import java.util.Random;

public class Tut3 {

	public static void main(String[] args) {
	
	Random rand = new Random();
		
		
		int[][] arr = new int[4][4];
		 

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j] = rand.nextInt(15);
				}
			}

			int max = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}

			
			int row = arr.length;
			int col = arr[0].length;
			int [][] res = new int[col][row];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					res[j][i] =arr[i][j];

				}
				
			}	
			
			
			
			System.out.println("----------------------------------------------");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(res[j][i] + "\t");
			}
			System.out.println();
		}
		
	}


	
	
		
		
	}
	

