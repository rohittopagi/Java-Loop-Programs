// Calculate the sum of all odd numbers from 1 up to n.

package While.com;
import java.util.*;
public class SumOfAllOddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
//		int i=1;
//		int n = sc.nextInt();
//		int sum = 0;
//		while (i<=n) {
//			sum = sum + i;
//			i += 2;
//		}
//		System.out.println(sum);
		
		int n = sc.nextInt();
		int k = (n + 1) / 2;
		int sum = k * k;
		System.out.println(sum);
		
		sc.close();
	}
}
