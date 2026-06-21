// Find the LCM (Least Common Multiple) of two given numbers.

package While.com;
import java.util.*;
public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int x = a;
		int y = b;
		
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		
		int lcm = (x * y) / a;
		System.out.println("LCM: " + lcm);
	}
}
