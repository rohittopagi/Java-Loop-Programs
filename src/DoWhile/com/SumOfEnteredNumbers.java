// Keep taking numbers from the user until 0 is entered, then print the sum of all entered numbers.

package DoWhile.com;
import java.util.*;
	public class SumOfEnteredNumbers {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int n;
			int sum = 0;
			
			do {
				n = sc.nextInt();
				sum = sum + n;
			} while (n != 0);
			System.out.println("Sum of entered numbers: " + sum);
		}
	}
