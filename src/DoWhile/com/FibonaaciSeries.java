// Print the Fibonacci series up to the required number of terms.
//Fibonacci -> Each number is the sum of the previous two numbers.

package DoWhile.com;
import java.util.*;
public class FibonaaciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int fib0 = 0;
		int fib1 = 1;
		int i = 1;
		do {
			System.out.print(fib0 + " ");
			int fib = fib0 + fib1;
			fib0 = fib1;
			fib1 = fib;
			i++;
		} while (i <= n);
	}
}
