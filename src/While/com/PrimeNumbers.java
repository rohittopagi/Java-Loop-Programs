//  Print all prime numbers between 1 and 100. 

package While.com;
public class PrimeNumbers {
	public static void main(String[] args) {
		int n = 1;
		while (n <= 100) {
			if (n > 1) {
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
					System.out.print(n + " ");
				}
			}
			n++;
		}
	}
}
