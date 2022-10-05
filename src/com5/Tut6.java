package com5;

public class Tut6 {

	public static String reverseWords(String s) {
		int i = 0 , j = 0;
		s = s.trim();
		String retString = "";
		
		for(j = 0 ; j<s.length() ; j++) {
			
			 if( j== s.length()-1) {
				retString +=revSubString(s.substring(i,j+1));
			}
			else if(s.charAt(j+1)==' ') {
				retString += revSubString(s.substring(i,j+1))+ " ";
				
				i=j+2;
				j+=1;
			}
		}
		return retString;
		
	}
	
	
	private static String revSubString(String s) {
		String sample = "";
		for(int i = s.length()-1 ; i >= 0;i--) {
			sample+= s.charAt(i);
		}
		return sample;
	}


	public static void main(String[] args) {

		
	String m =	reverseWords("my name is ajay singh");
	System.out.println(m);
		
	}
	
	

}
