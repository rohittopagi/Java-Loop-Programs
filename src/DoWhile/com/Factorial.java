// Calculate and print the factorial of the given number.
// Ex: 5! = 120 -> 1x2x3x4x5 = 120
package DoWhile.com;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int fact = 1;
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		do {
			fact = fact * i;
			i++;
		} while (i <= n );
		
		System.out.println("Factorial of " + n + " is " + fact);
	}
}
