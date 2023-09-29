import java.util.*;

public class MainActivity2 {
	/*
	 * authors
	 * Ben Jay Sullera
	 * Yvonnie Durano
	 * Karen Jucdong
	 * Mac Jason bronola
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many racket: ");
		int size = input.nextInt();
		Racket[] racket = new Racket[size];
		int loop;
		for (loop = 0; loop < racket.length; loop++) {
			racket[loop] = new Racket();
		}

		System.out.println("Enter the following data");
		for (loop = 0; loop < racket.length; loop++) {
			int num = loop + 1;
			System.out.println();
			System.out.print("Brand of the racket " + num + ":");
			String space = input.nextLine();
			racket[loop].setName(input.nextLine());
			System.out.print("Category " + num + ":");
			racket[loop].setCategory(input.nextLine());
			System.out.print("Price " + num + ":");
			racket[loop].setPrice(input.nextInt());
		}
		System.out.println("\n");
		System.out.println("Entered racket:");
		for (loop = 0; loop < racket.length; loop++) {
			racket[loop].display();
		}

	}

}
/*
 * Goods
 */