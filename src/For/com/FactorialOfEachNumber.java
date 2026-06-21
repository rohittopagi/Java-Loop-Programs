// Calculate and print the factorail of every number from 1 to n.

package For.com;
import java.util.*;

public class FactorialOfEachNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			int fact = 1;
			for (int j=1; j <= i; j++) {
				fact = fact * j;
			}
			System.out.println("Factorial of " + i + " is " + fact);
		}
		sc.close();
	}

}
