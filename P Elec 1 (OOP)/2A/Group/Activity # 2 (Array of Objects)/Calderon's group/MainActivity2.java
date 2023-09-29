import java.util.Scanner;

public class MainActivity2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of drink objects: ");
        int numDrinks = s.nextInt();
        s.nextLine();

        String[][] drinks = new String[numDrinks][3];

        for (int i = 0; i < drinks.length; i++) {

            System.out.println("Enter information for drink " + (i + 1) + ":");

            System.out.print("Kind of drinks: ");
            drinks[i][0] = s.nextLine();

            System.out.print("Brand Name: ");
            drinks[i][1] = s.nextLine();

            System.out.print("Price each: ");
            drinks[i][2] = String.valueOf(s.nextInt());
            s.nextLine();

            System.out.println();
        }

        System.out.println("Drink has been successfully created:");

        for (int i = 0; i < drinks.length; i++) {

            System.out.println("Kind of drinks: " + drinks[i][0]);

            System.out.println("Brand Name: " + drinks[i][1]);

            System.out.println("Price each: " + Integer.parseInt(drinks[i][2]));

            System.out.println();
        }
    }
}

/*
 * Goods but need to check further
 */