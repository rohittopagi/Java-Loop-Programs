//  Create a menu-driven program that allows the user to choose and perform different operations. 

package DoWhile.com;
import java.util.*;

public class MenuDrivenPrgm {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int a, b;
		
		do {
			System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Exit \n");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				System.out.println("Enter Numbers");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Addition: " + (a + b));
				break;
				
			case 2:
				System.out.println("Enter Numbers");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Subtraction: " + (a - b));
				break;
				
			case 3: 
				System.out.println("Enter Numbers");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Multiplication: " + (a * b));
				break;
				
			case 4:
				System.out.println("Enter Numbers");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Division: " + (a / b));
				break;
				
			default :
				System.out.println("Invalid choice!!");
			}
		} while (choice != 5);
	}
}
