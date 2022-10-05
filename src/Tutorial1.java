
import java.util.*;
public class Tutorial1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String word = sc.nextLine();
		int len = word.length();
		char ch ;
		int count = 0;
		for(int i = 0; i< word.length() ; i++) {
			ch = word.charAt(i);
			if(ch == ' ') {
				count++;
				
			}
			
		}
		System.out.println("total word is :" + (count + 1) );
	}
	
}
