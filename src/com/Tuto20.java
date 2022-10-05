package com;
import java.util.*;

public class Tuto20 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String string = sc.nextLine().toUpperCase();

int count = 0;
for(int i = 0; i< string.length(); i++) {
	
	for(int j = i+1; j< string.length() ; j++) {
		
		if(string.charAt(i)==string.charAt(j)) {
			count++;
			
		}
		break;
		}
	}
if(count == 0) {
	System.out.println("no letter is not repeated");
}
else if(count >=1) {
	System.out.println("yes letter is repeated");
}
}
}
	
	
	
	
	
	
	
