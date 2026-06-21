// Check whether the given number is a prime number.

package For.com;
import java.util.*;

public class GivenPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println(n + " not a prime number");
		} else {
			int flag = 0;
			for (int i=2; i * i <= n; i++) {
				if (n % i == 0) {
					flag = 1;
					break;
				}
			}
		
			if (flag == 0) {
				System.out.println(n + " is Prime Number");
			} else {
				System.out.println(n + " is not a Prime number");
			}
		}
		sc.close();
	}
}

// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97