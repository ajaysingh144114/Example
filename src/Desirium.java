import java.util.*;
public class Desirium {
int num ;
int size;

public Desirium(int nn) {
	num = nn;
	size=0;
}

int count_digit() {
	int temp = num;
	String s = "";
	 s = s+temp;
	 int l = s.length();
	 size = l;
	return size;
}

int sum_digit(int n, int p) {
	if(n ==0) {
		return 0;
	}
	else {
		return (int) Math.pow(n%10, p) + ( sum_digit(n/10,p-1));
	}
	
}
void check() {
	if(num == sum_digit(num ,size)) {
		System.out.println("it is desirium number");
	}
	else {
		System.out.println("it is not the desirium number");
	}
}


	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the digit");
		
		int number = sc.nextInt();
		
		Desirium d = new Desirium(number);
		
		d.count_digit();
		
		d.check();

	}

}
