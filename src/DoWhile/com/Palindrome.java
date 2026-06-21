package DoWhile.com;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int org = n;
		int rev = 0;
		do {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10; 
		} while (n != 0);
		
		if (org == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
