// Find the HCF(Highest Common Factor) of the given number.

package For.com;
import java.util.*;

public class HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min = (a < b) ? a : b;
		int hcf = 1;
		
		for (int i=1; i<=min; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
		sc.close();
	}

}
