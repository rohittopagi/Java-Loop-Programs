// Find the LCM (Least Common Multiple) of the given numbers.

package For.com;
import java.util.*;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max = (a > b) ? a : b;
		for (int i=max; i <= a*b; i++) {
			if (i % a == 0 && i % b == 0) {
				System.out.println("LCM of " + a + " and " + b + " is: " + i);
				break;
			}
		}
		sc.close();
	}
}
