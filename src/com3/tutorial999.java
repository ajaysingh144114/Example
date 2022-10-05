package com3;

public class tutorial999 {

	public static void main(String[] args) {
		
		for(int i = 1; i< 6 ; i++) {
			for(int j = 2 ; j< 5 ; j++) {
				if(j == 3)
					continue;
				System.out.println(i + " " + j);
			}
		}

	}

}
