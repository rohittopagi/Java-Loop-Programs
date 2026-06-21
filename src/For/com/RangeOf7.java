// Print all numbers between a and b that are divisible by 7.

package For.com;
import java.util.*;

public class RangeOf7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to print divisible of 7:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Divisible of 7 are: ");
		for (int i = a; i <= b; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}