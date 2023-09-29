import java.util.Scanner;

public class MainActivity2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int loop, num;
		System.out.println("How many notebook o you want to crete?");
		num = scan.nextInt();

		System.out.println();
		Notebook[] notebook = new Notebook[num];

		for (loop = 0; loop < notebook.length; loop++) {
			notebook[loop] = new Notebook();

			System.out.print("Enter Notebook Brand: ");
			notebook[loop].setBrand(scan.next());

			System.out.print("Enter Notebook Color: ");
			notebook[loop].setColor(scan.next());

			System.out.print("Enter Notebook Leaves: ");
			notebook[loop].setLeaves(scan.nextInt());

			System.out.println();
		}

		for (loop = 0; loop < notebook.length; loop++) {
			System.out.print("Notebook is created!!");
			System.out.println("Brand: " + notebook[loop].getBrand());
			System.out.println("Color: " + notebook[loop].getColor());
			System.out.println("Leaves: " + notebook[loop].getLeaves() + "\n\n");
		}

	}

}
