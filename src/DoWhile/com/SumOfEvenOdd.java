//  Calculate and print the sum of even digits and the sum of odd digits of the given number separately

package DoWhile.com;
import java.util.*;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		do {
			int digit = n % 10;
			if (digit % 2 == 0) {
				evenSum = evenSum + digit;
			} else {
				oddSum = oddSum + digit;
			}
			n = n / 10;
		} while (n != 0);
		
		System.out.println("Sum of Even Number: " + evenSum);
		System.out.println("Sum of Odd Number: " + oddSum);

	}
}
