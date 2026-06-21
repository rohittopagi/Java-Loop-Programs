// Calculate and print the factorial of a given number.

package While.com;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int i = 1;
		int fact = 1;
		int n = sc.nextInt();
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorail of " + n + " is: " + fact);
		
		sc.close();
	}
}
