// Print the square of each number from 1 to n.

package While.com;
import java.util.*;
public class SquareOfEachNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int i = 1;
		while(i <= n) {
			int sq = i * i;
			System.out.print(sq+ " ");
			i++;
		}
	}
}