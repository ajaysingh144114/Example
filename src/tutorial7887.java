
public class tutorial7887 {
	public static void main(String[] args) {
		int num = 5656;
		int rev = 0;
		while(num>0) {
		int rem = num % 10;
			rev = rev * 10 + rem;
			num/=10;
		}
		System.out.println(rev);
	}
}

