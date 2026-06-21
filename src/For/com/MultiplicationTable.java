// Print the multiplication table of a given number.

package For.com;
import java.util.*;

public class MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}
		sc.close();
	}

}
