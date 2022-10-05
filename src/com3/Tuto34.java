package com3;

public class Tuto34 {

	 static int happyNum(int x ) {
	int m = x;
	int n = 0;
	
	while(m > 0) {
		int sum = 0;
	
	while(m > 9) {
		int rem = m % 10;
		sum += Math.pow(rem, 2);
		m /= 10;
	}
	System.out.println(sum);
	 m= sum;
	 if(m == 1)
		 break;
	}
	return m;
	 }
	public static void main(String[] args) {
		
int x = happyNum(5);

if(x == 1) {
	System.out.println("it is the happy number");
}
else if (x > 1) {
System.out.println("it is not the happy number");
}

	}

}
