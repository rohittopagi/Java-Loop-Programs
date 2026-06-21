// Find the HCF (Highest Common Factor) and LCM (Least Common Multiple) of two given numbers

package While.com;
import java.util.*;
public class HCFandLCMof2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int org_a = a;
		int org_b = b;
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		int hcf = a;
		
		int lcm = (org_a * org_b) / hcf;
		
		System.out.println("HCF of " + org_a + " and " + org_b + " is: " + hcf);
		System.out.println("LCM of " + org_a + " and " + org_b + " is: " + lcm);
	}
}
