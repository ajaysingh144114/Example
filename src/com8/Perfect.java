package com8;
import java.util.*;
public class Perfect {
static int num;
public Perfect(int nn) {
	num = nn;
	
}
 int sum_of_factors(int i) {
	int n = num;
	if(i ==1) {
		return 1 + sum_of_factors(i+1);
	}
	else if(n % i ==0 && i < n) {
		return i + sum_of_factors(i+1);
	}
	else if(n % i !=0 && i < n) {
		return 0+sum_of_factors(i+1);
	}
	else {
		return 0;
	}
	
	
}
void display() {
	int x = sum_of_factors(1);
if(num == x) {
	System.out.println("it is the perfect number");
}
else {
	System.out.println("it is not the perfect number");
}
	
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	Perfect p = new Perfect(num);
	p.display();
}
}

