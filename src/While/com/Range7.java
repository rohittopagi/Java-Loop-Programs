// Print all numbers between a and b that are divisible by 7. 

package While.com;
import java.util.*;
public class Range7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = a;
		System.out.println("Numbers divisible by 7 between " + a + " and " + b + " is: ");
		while (i <= b) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}
