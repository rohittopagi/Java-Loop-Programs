// Reverse the given number and print the reversed value.

package While.com;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int reverse = 0;
		while (n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		System.out.println("Reversed: " + reverse);
		sc.close();
	}

}
