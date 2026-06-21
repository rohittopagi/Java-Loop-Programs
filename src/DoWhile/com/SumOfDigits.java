// Find and print the sum of digits of the given number.

package DoWhile.com;
import java.util.*;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int sum = 0;
		do {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		} while (n != 0);
		
		System.out.println("Sum of Digit: " + sum);
	}
}