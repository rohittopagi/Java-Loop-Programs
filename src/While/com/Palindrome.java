// Check whether the given number is a prime number.

package While.com;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int original_n = n;
		int reverse = 0;
		while (n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		if (original_n == reverse) {
			System.out.println(original_n + " is Palindrome");
		} else {
			System.out.println(original_n + " is not Palindrome");
		}
		sc.close();
	}
}
