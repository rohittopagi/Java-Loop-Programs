// Reverse the given number and print the reversed value.

package DoWhile.com;
import java.util.*;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int reverse = 0;
		do {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		} while (n != 0);
		System.out.println("Reversed number is: " + reverse);
	}
}
