import java.util.*;
public class Pglatinnum {
//Write a program that encodes a word into Piglatin.
	//To translate a word into a Piglatin word, convert 
	//the word into uppercase and then place the first 
	//vowel of the original word as the start of the 
	//new word along with the remaining alphabets. 
	//The alphabets present before the vowel 
	//being shifted towards the end followed by “AY”.

//Sample Input (1) : London,
//Sample Output (1) : ONDONLAY

//Sample Input (2) : Olympics,
//Sample Output (2) : OLYMPICSAY
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String word = sc.nextLine().toUpperCase();
		char ch ;
		String s ="";
		int i;
		for( i = 0; i< word.length();i++) {
		ch = word.charAt(i);
		if(ch == 'A' || ch =='E'||ch == 'I'|| ch == 'O'||ch =='U') {
			break;
		}
		
		}
		s = word.substring(i)+word.substring(0,i)+ "AY";
		System.out.println("piglatin word is " + s);
	}
}
