
public class formula1 {

	public static String reverseWords(String s) {
		
		String [] words = s.split(" ");
		String rev = new String();
		
		for(int i = words.length-1; i>= 0; i--) {
			if(words[i].trim().length()!= 0) {
				rev += words+" ";
				
			}
			rev.trim();
		}
		return rev;
		
	}
	
	public static void main(String args[]) {
		
		
	String s =	reverseWords("my name is ajay singh");
	
	System.out.println(s);
		
		
	}
	
	
	
}
