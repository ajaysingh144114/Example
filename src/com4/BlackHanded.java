package com4;

public class BlackHanded {

	
	 int state = 0;
	 
	  BlackHanded(int s){
		 this.state = s;
	 }
	
	public static void main(String[] args) {
		
		BlackHanded b1 = new BlackHanded(1);
		BlackHanded b2 = new BlackHanded(2);
		
		System.out.println(b1.go(b1)+ " " + b2.go(b2));
		
		
	}

	int go(BlackHanded b) {
		if(this.state == 2) {
			b.state = 5;
			go(this);
		}
		return ++this.state;
	}
	
	
}
