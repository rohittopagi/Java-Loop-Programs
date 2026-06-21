// Check whether the given number is an Armstrong number. 

package While.com;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int original = n;
		int count = 0;
		int sum = 0;
		
		// Step-1 - Count digits
		int temp = n;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		
		// Step-2 - Calculate sum of powers
		temp = n;
		while (temp != 0) {
			int digit = temp % 10;
			int power = 1;
			int i = 0;
			while (i < count) {
				power = power * digit;
				i++;
			}
			sum = sum + power;
			temp = temp / 10;
		}
		
		// Step-3 - Compare
		if (sum == original) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
		sc.close();
	}
}
