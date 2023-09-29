/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * ACHAPERO, CHARLIE
 * BANTILAN, ALVIN
 * MISSION, JOSE NEIL
 * TUICO, MARTIN
 */
public class Drinks {
    private String drinkName;
    private String drinkUnit;
    private double drinkPrice;

    public Drinks() {
        // Default constructor with no arguments
    }

    Drinks(String drinkName, String drinkUnit, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkUnit = drinkUnit;
        this.drinkPrice = drinkPrice;
    }

    // Getter and Setter for name
    protected String getDrinkName() {
        return drinkName;
    }

    protected void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    // Getter and Setter for startingAtSeconds
    protected String getDrinkUnit() {
        return drinkUnit;
    }

    protected void setDrinkUnit(String drinkUnit) {
        this.drinkUnit = drinkUnit;
    }

    // Getter and Setter for powerSpeed
    protected double getDrinkPrice() {
        return drinkPrice;
    }

    protected void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

}
