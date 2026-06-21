// Check whether the given number is a prime number.

package While.com;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println(n + " not Prime number");
		} else {
			int i = 2;
			int flag = 0;
			while (i * i <= n) {
				if (n % i == 0) {
					flag = 1;
					break;
				}
				i++;
			}
			if (flag == 0) {
				System.out.println(n + " is Prime number");
			} else {
				System.out.println(n + " is not a Prime number");
			}
		}
		sc.close();
	}
}
