// Count and print the number of digits in the given number 

package DoWhile.com;
import java.util.*;
public class CountAndPrintNumberOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int count = 0;
		do {
			n = n / 10;
			count++;
		} while (n != 0);
		System.out.println("Number of digits: " + count);
	}
}
