// Find and print the sum of the Fibonacci series up to n terms.

// Fibonacci series -> 0, 1, 1, 2, 3, 5, 8, 13, 21

package While.com;
import java.util.*;
public class SumOfFibonaaciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int fib0 = 0;
		int fib1 = 1;
		int sum = 0;
		if (n >= 1) {
			sum = fib0;
		}
		
		if (n >= 2) {
			sum = sum + fib1;
		}
		
		int i = 3;
		while (i <= n) {
			int fib = fib0 + fib1;
			sum = sum + fib;
			fib0 = fib1;
			fib1 = fib;
			i++;
		}
		System.out.println("Sum: " + sum);
	}
}