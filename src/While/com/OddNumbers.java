// Print all odd numbers between 1 and 100.

package While.com;

public class OddNumbers {
	public static void main(String[] args) {
//		int i = 1;
//		while (i <= 100) {
//			System.out.println(i);
//			i += 2;
//		}
		
		int i = 1;
		while (i <= 100) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
