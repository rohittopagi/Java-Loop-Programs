// Calculate the sum of all even numbers from 1 up to n.

package While.com;
import java.util.*;
public class SumOfAllEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
//		int n = sc.nextInt();
//		int i = 2;
//		int sum = 0;
//		while (i <= n) {
//			sum = sum + i;
//			i += 2;
//		}
//		System.out.println(sum);
		
		int n = sc.nextInt();
		int k = n / 2;
		int sum = k * ( k + 1);
		System.out.println(sum);
		
		sc.close();
	}
}
