// Find the HCF (Highest Common Factor) of two given numbers.

package While.com;
import java.util.*;
public class HCF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int org_a = a;
		int org_b = b;
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		System.out.println("HCF of " + org_a + " and " + org_b + " is: " + a);
	}
}