package com;

public class tuto9889 {
	 public static void main(String[] args) {
	        int marks = 90;
	        if (marks > 80) {
	            System.out.println("Excellent");
	            if (marks < 70) {
	                System.out.println("Good");
	                if (marks < 60) {
	                    System.out.println("Average");
	                }
	            }
	        }
	        int i = 1, j = 0;
	        switch (i) {
	            case 2 :
	                j += 6;
	            case 4 :
	                j += 1;
	            default :
	                j += 2;
	            case 0 :
	                j += 4;
	        }
	        System.out.println("j = " + j);
	    }
	 
	}


