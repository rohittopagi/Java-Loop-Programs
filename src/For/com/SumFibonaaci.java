//  Find the print the sum of the Fibonacci series.

package For.com;
import java.util.*;

public class SumFibonaaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int sum = 0;
		int fib0 = 0;
		int fib1 = 1;
		for (int i=1; i<=n; i++) {
			sum = sum + fib0;
			int fib = fib0 + fib1;
			fib0 = fib1;
			fib1 = fib;
		}
		System.out.println("Sum of Fibonaaci: " + sum);
		sc.close();
	}
}
