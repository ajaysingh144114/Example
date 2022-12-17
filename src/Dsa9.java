import java.util.Scanner;

public class Dsa9 {

	String wrd;
	int length;
	
	public Dsa9(String nn) {
		wrd = nn;
		length = 0;
	}
	void read_words() {
		
	}
	public void count() {
	int k = 0;
	int m = 0;
		for (int i = 0; i <wrd.length(); i++) {
			char ch = wrd.charAt(i);
			if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch =='u') {
				k++;
			}
			else {
				m++;
			}
		}
		
		System.out.println("vowel is" + k + ", consonant" + m);
		
		
	}
	
	void arrange() {
		String s = "";
		String k = "";
		for(int i = 0 ;i < wrd.length();i++) {
			char ch = wrd.charAt(i);
			if(ch == 'A' || ch == 'E'|| ch == 'I'|| ch == 'O'|| ch =='U') {
				s+=ch;
			}
			else {
				k+=ch;
			}
			
		}
		String f = s.concat(k);
		System.out.println(f);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string");
		
		String word = sc.next().toUpperCase();
		
		Dsa9 d = new Dsa9(word);
		
		d.arrange();
		
		
	}
	
	
}
