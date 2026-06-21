
// Check whether the given number is an Armstrong number
// Armstrong -> Sum of each digit raised to the power of the number of digits is equal to original number

package DoWhile.com;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int org = n;
		int sum = 0;
		int count = 0;
		
		int temp = n;
		do {
			temp = temp / 10;
			count++;
		} while (temp != 0);
		
		temp = n;
		do {
			int digit = temp % 10;
			int power = 1;
			int i = 0;
			
			do {
				power = power * digit;
				i++;
			} while (i < count);
			
			sum = sum + power;
			temp = temp / 10;
			
		} while (temp != 0);
		
		if (sum == org) {
			System.out.println(n + " is Armstrong number");
		} else {
			System.out.println(n + " is not Armstrong number");
		}
	}
}
