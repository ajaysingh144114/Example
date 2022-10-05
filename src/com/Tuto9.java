package com;
import java.util.*;
import java.util.Scanner;

public class Tuto9 {
	static int searchNumber;
		
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x[] = {4,78,2,65,12,89};
		int foundIndex = -1;
		System.out.println("enter the search element");
	searchNumber= sc.nextInt();
		
		for(int i = 0; i< x.length;i++) {
			if(x[i]== searchNumber) {
				foundIndex = i;
				break;
			}
			
		}
		if(foundIndex >= 0) {
			System.out.println("Number" + searchNumber + "found at indext"+foundIndex);
		}
		else {
			System.out.println("Number" + searchNumber + " not found");
		}
		}

	

}

