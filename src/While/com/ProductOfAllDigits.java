// Find and print the product of all digits of a given number.

package While.com;
import java.util.*;
public class ProductOfAllDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int product = 1;
		while (n != 0) {
			int digit = n % 10;
			product = product * digit;
			n = n / 10;
		}
		System.out.println("Product is: " + product);
		sc.close();
	}

}
