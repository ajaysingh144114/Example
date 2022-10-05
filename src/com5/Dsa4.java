package com5;

import java.util.Random;
import java.util.*;

public class Dsa4 {
//print the sum of the maximum row
	public static void main(String[] args) {

		Random rand = new Random();

		int[][] arr = new int[3][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(12);
			}
		}

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];

				if (max < sum) {
					max = sum;
				}
			}

		}
		System.out.println("total sum of the largest row is = " + max);
	}
}