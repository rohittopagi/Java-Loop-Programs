// Print the Fibonacci series up to the required number of terms.

package For.com;
import java.util.*;
public class FibonaaciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println(n);
		} else if (n == 1) {
			System.out.println(n);
		} else {
			int fib0 = 0;
			int fib1 = 1;
			int fib = 0;
			for (int i=2; i<=n; i++) {
				fib = fib0 + fib1;
				fib0 = fib1;
				fib1 = fib;
			}
			System.out.println("Fionaaci of " + n + " is " + fib);
		}
		sc.close();
	}
}
