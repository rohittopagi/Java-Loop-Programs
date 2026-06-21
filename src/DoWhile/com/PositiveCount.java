package DoWhile.com;
import java.util.*;

public class PositiveCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n;
		int count = 0;
		do {
			n = sc.nextInt();
			if(n >= 0) {
				count++;
			}
		} while (n >= 0);
		System.out.println("Count of Positive number is: " + count);
	}

}
