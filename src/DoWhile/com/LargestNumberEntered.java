// Keep taking numbers from the user until 0 is entered, then print the largest number among all inputs.

package DoWhile.com;
import java.util.*;
public class LargestNumberEntered {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n;
		int max = 0;
		do {
			n = sc.nextInt();
			if (n > max) {
				max = n;
			}
		} while (n != 0);
		System.out.println("Largest among all numbers entered is " + max);
	}
}
