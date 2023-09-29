
import java.util.Scanner;

public class MainActivity2 {
	public static void main(String args[]) {
		/*
		 * Authors:
		 * Ella Pasohil
		 * Franz louie Coyoca
		 * Maery Carmel Rosales
		 * Hardly Ross Jose Cagado
		 */

		Scanner scan = new Scanner(System.in);

		int loop, num;
		System.out.print("How many T-shirt do  you want to purchase?: ");
		num = scan.nextInt();
		System.out.println();
		Tshirt[] nina = new Tshirt[num];

		for (loop = 0; loop < nina.length; loop++) {

			nina[loop] = new Tshirt();
			System.out.print("Enter T-Shirt Brand: ");
			nina[loop].setBrand(scan.next());
			System.out.print("Enter T-shirt Color: ");
			nina[loop].setColor(scan.next());
			System.out.print("Enter Quantity: ");
			nina[loop].setQuantity(scan.nextInt());
			System.out.println();
		}
		System.out.println("T-shirt purchase: \n");
		for (loop = 0; loop < nina.length; loop++) {

			System.out.println("Brand: " + nina[loop].getBrand());
			System.out.println("Color: " + nina[loop].getColor());
			System.out.print("Quantity: " + nina[loop].getQuantity() + "\n\n");
		}
		System.out.print("You have succesfully purchased the items");
	}

}
/*
 * Spacing issue
 */