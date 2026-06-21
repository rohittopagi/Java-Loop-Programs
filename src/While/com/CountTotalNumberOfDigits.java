// Count and print the total number of digits in a given number.

package While.com;
import java.util.*;
public class CountTotalNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int count = 0;
		while (n != 0) {
			int digit = n % 10;
			n = n/10;
			count++;
		}
		System.out.println("Number of digits: " + count);
		
		sc.close();
	}

}
