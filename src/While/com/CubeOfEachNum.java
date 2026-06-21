// Print the cube of each number from 1 to n.

package While.com;
import java.util.*;
public class CubeOfEachNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while(i <= n) {
			int cube = i * i * i;
			System.out.println(cube);
			i++;
		}
	}
}
