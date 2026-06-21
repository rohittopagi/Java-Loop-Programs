//  Find the smallest digit in the given number.

package While.com;
import java.util.*;
public class SmallestDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int min = 9;
		while (n != 0) {
			int digit = n % 10;
			if (digit < min) {
				min = digit;
			}
			n = n / 10;
		}
		System.out.println("Samllest digit: " + min);
	}
}