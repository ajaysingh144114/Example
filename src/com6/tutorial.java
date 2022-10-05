package com6;

import java.util.*;

public class tutorial {
	
	public static int isPrime(int x) {
		
		 int count = 0;
		
		for (int i = 1; i <= x; i++) {
			if(x % i == 0) {
			
				count ++;
				
				
			}
		}
		
		return count;
	}
	
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the numbr ");
	
	int N = sc.nextInt();
        int res1=0; 
        int res2=0; 
        if(N>9 && N<50) 
        { 
            if(N%2==0) 
            { 
                System.out.println("PRIME PAIRS ARE:"); 
                for(int i=3;i<=N;i++) 
                { 
                    if(i%2!=0) 
                    { 
                        res1=isPrime(i); 
                        for(int j=i;j<=N;j++) 
                        { 
                            if(j%2!=0) 
                            { 
                                res2=isPrime(j); 
                                if(res1==2&&res2==2)  
                               { 
                                    int temp=i+j; 
                                    if(temp==N) 
                                    { 
                                        System.out.println(i+", "+j);  } 
                                    }
                                res2=0; 
                              } 
                            } 
                        res1=0; 
                       } 
                  } 
              } 
            else 
            { 
                System.out.println("INVALID INPUT. NUMBER IS ODD");  } 
            } 
        else 
        { 
            System.out.println("INVALID INPUT. NUMBER OUT OF RANGE.");  } 
	}
	
	
}