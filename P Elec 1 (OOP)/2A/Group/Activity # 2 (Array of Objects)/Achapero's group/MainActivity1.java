/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authors
 *          ACHAPERO, CHARLIE
 *          BANTILAN, ALVIN
 *          MISSION, JOSE NEIL
 *          TUICO, MARTIN
 */
public class MainActivity1 {
    public static void main(String[] args) {
        Drinks drink1 = new Drinks("Sprite", "247ml", 15.25);
        Drinks drink2 = new Drinks("Coke", "1L", 55);
        Drinks drink3 = new Drinks("Royal", "2L", 110);

        System.out.print("1st Object: " + drink1.getDrinkName() + ", ");
        System.out.print(drink1.getDrinkUnit() + ", ");
        System.out.print("Php " + drink1.getDrinkPrice() + "\n");
        System.out.println("==================================");
        System.out.println("");

        System.out.print("2nd Object: " + drink2.getDrinkName() + ", ");
        System.out.print(drink2.getDrinkUnit() + ", ");
        System.out.print("Php " + drink2.getDrinkPrice() + "\n");
        System.out.println("==================================");
        System.out.println("");

        System.out.print("3rd Object: " + drink3.getDrinkName() + ", ");
        System.out.print(drink3.getDrinkUnit() + ", ");
        System.out.print("Php " + drink3.getDrinkPrice() + "\n\n");
        System.out.println("==================================");
        System.out.println("");
    }
}
