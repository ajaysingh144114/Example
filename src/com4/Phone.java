package com4;

public class Phone {

	 private int number;
	private int weight;
	String color;
	
	
	 void setnumber(int number ) {
		if(number > 0 && number < 100000000) {
		this.number = number ;
		}else {
		System.out.println("enter the right inpu");
		}
	}
	
	public int getnumber() {
		return number ;
	}
	
	public static void main(String[] args) {
		
		
		
		
	}

}
