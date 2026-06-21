// Print the square of each number from 1 to n.

package For.com;
import java.util.*;

public class SquareOfEach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Square of each number:");
		int n = sc.nextInt();
		for (int i=1; i<= n; i++) {
			System.out.println("Square of " + i + " is " + (i * i));
		}
		sc.close();
	}
}