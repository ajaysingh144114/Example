package com3;
import java.io.*;
public class tutorial7887 {
			public static void main(String [] args ) throws IOException {
				BufferedReader reader =new BufferedReader( new InputStreamReader(System.in))
						;	
							
							System.out.println("enter the string");
							
							String word = reader.readLine();
							
							word = word.trim();
							int len = word.length();
							
							int count = 0;
							for(int i = 0; i < len ; i++) {
								char ch = word.charAt(i);
								if(ch == ' ') {
									count++;
								}
							}
							System.out.println(count);	
			}
}
