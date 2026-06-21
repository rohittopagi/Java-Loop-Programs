// Print the cube of each number from 1 to n.

package For.com;
import java.util.*;

public class CubeOfEach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int i=1; i<= n; i++) {
			System.out.println("Cube of " + i + " is " + (i * i * i));
		}
		sc.close();
	}
}
