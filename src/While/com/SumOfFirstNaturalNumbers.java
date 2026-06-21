// Calculate and print the sum of the first n natural numbers.

package While.com;
import java.util.*;
public class SumOfFirstNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
//		int i =1;
//		int n= sc.nextInt();
//		int sum = 0;
//		while(i <= n) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);
		
		// Optimized approach
		int n = sc.nextInt();
		int sum = n * (n+1) / 2;
		System.out.println("Sum of " + n + " natural numbers is: " + sum);
		
		sc.close();

	}

}
