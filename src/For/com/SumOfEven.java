// Find and print the sum of all even numbers from 1 up to n.

package For.com;
import java.util.*;

public class SumOfEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc. nextInt();
		int sum = 0;
		for (int i=1; i<=n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of " + n + " Even is " + sum);
		sc.close();
	}

}
