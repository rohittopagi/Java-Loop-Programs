// Find and print the sum of all factors of the given number.

package For.com;
import java.util.*;

public class SumOfFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:1");
		int n = sc.nextInt();
		int sum = 0;
		for (int i=1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
// example: 4
// 4 is divisible by 1, 2, 4 so sum = 1 + 2 + 4 = 7