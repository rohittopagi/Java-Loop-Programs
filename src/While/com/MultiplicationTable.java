// Print the multiplication table of a given number from n × 1 to n × 10.

package While.com;
import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(n + " x " + i + " = " + (n*i));
			i++;
		}
		sc.close();
	}
}
