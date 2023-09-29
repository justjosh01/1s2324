/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * ACHAPERO, CHARLIE
 * BANTILAN, ALVIN
 * MISSION, JOSE NEIL
 * TUICO, MARTIN
 */
public class MainActivity2 {
    public static void main(String[] args) {
        System.out.println("ARRAY WITH GETTERS AND SETTERS");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of drinks: ");
        int numDrinks = scanner.nextInt();
        scanner.nextLine();

        Drinks[] drinksArray = new Drinks[numDrinks];

        for (int i = 0; i < numDrinks; i++) {
            System.out.println("Enter details for drink " + (i + 1) + ":");

            Drinks drink = new Drinks();

            System.out.print("Drink Name: ");
            drink.setDrinkName(scanner.nextLine());

            System.out.print("Drink Unit: ");
            drink.setDrinkUnit(scanner.nextLine());

            System.out.print("Drink Price: ");
            drink.setDrinkPrice(scanner.nextDouble());
            scanner.nextLine();

            System.out.println("===========================");
            System.out.println();

            drinksArray[i] = drink;
        }

        for (int i = 0; i < numDrinks; i++) {
            Drinks drink = drinksArray[i];
            System.out.println("Drink " + (i + 1) + " details:");
            System.out.println("Name: " + drink.getDrinkName());
            System.out.println("Unit: " + drink.getDrinkUnit());
            System.out.println("Price: " + drink.getDrinkPrice());
            System.out.println();
        }

        System.out.print("Congratulations! You created " + numDrinks + " Drink/s. GOODBYE!");
    }
}

/*
 * Goods but need to check further
 */
