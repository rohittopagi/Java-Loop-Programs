// Find the HCF (Highest Common Factor) of the given numbers.

package DoWhile.com;
import java.util.*;
public class HCF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a = sc.nextInt();
		System.out.println("Enter number 212:");
		int b = sc.nextInt();
		
		int x = a;
		int y = b;
		
		do {
			int r = a % b;
			a = b;
			b = r;
		} while (b != 0);
		System.out.println("HCF of " + x + " & " + y + " is " + a);
	}
}
