// Print all odd numbers between 1 and 100.

package For.com;

public class OddNumber {
	public static void main(String[] args) {
		System.out.println("Odd numbers till 100");
		for (int i=1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
