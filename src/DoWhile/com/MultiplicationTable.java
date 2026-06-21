// Print the multiplication table of a given number.

package DoWhile.com;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int i = 1;
		System.out.println("Multiplication of " + n + " table is: ");
		do {
			System.out.println(n + " x " + i + " = " + (n * i));
			i++;
		} while (i <= 10);
	}
}
