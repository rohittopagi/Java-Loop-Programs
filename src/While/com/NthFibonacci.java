// Find the nth Fibonacci number

package While.com;
import java.util.*;
public class NthFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int fib0 = 0;
		int fib1 = 1;
		int fib = 0;
		int i = 1;
		while (i <= n) {
			fib = fib0 + fib1;
			fib0 = fib1;
			fib1 = fib;
			i++;
		}
		System.out.println("Fib of "+ n + " is: " + fib);
		
		sc.close();
	}
}
