package com8;
import java.util.*;
public class Emirp {
 
	int rev ;
	int n ;
	int f;
	
	Emirp(int nn){
		n =nn;
		rev = 0;
		f = 2;
	}
	
	int isPrime(int x){
		if(f== x /2 +1) {
			return 1;
		}
		if(x % f ==0) {
			return 0;
		}
		f++;
		return isPrime(x);
	}
	void isEmirp(){
		int temp = n;
		while(temp > 0) {
			int rem = temp % 10;
			rev= rev * 10 + rem;
			temp /=10;
		}
	if(isPrime(n)==isPrime(rev)) {
		System.out.println(true);
	}
	else {
		System.out.println(false);
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Emirp h = new Emirp(num);
		h.isEmirp();
	}
	
	
}
