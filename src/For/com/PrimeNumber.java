// Print all prime numbers between 1 and 100.

package For.com;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Prime numbers till 100");
		for (int i=1; i<=100; i++) {
			if (i <= 1) {
				continue;
			}
			int flag = 0;
			for (int j=2; j * j <= i; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
