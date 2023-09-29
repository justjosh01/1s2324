import java.util.Scanner;

public class MainActivity2 {
	// Authors:
	// Jerwin Noval
	// Tristan Rey Vasquez
	// David Sun Damayo
	// Eufemia Moralde
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int loop, num;
		System.out.println("How many motorcyle you want to create?: ");
		num = scan.nextInt();
		Motorcycle[] bike = new Motorcycle[num];

		for (loop = 0; loop < bike.length; loop++) {

			bike[loop] = new Motorcycle();
			System.out.print("Enter Motorcycle Brand: ");
			String space = scan.nextLine();
			bike[loop].setBrand(scan.nextLine());
			System.out.print("Enter Motorcycle Color: ");
			bike[loop].setColor(scan.nextLine());
			System.out.print("Enter Motorcycle Power: ");
			bike[loop].setPower(scan.nextInt());
			System.out.println();
		}
		for (loop = 0; loop < bike.length; loop++) {

			System.out.println("Motorcycle " + loop + " is created!!");
			System.out.println("Brand: " + bike[loop].getBrand());
			System.out.println("Color: " + bike[loop].getColor());
			System.out.println("Power: " + bike[loop].getPower() + "\n");

		}
		System.out.println("Congratulation you've created your motorcycles!!");
	}

}

/*
 * Comment properly
 * User prompt is confusing
 * Organize your code properly
 */