// Check whether the given number is a Perfect number.

// A perfect number is a number whose sum of proper factors (excluding itself) equals the number.

package While.com;
import java.util.*;
public class PrefectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i < n) {
			if (n % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == n) {
			System.out.println("Perfect number");
		} else {
			System.out.println("Not Prefect Number");
		}
		sc.close();
	}
}
