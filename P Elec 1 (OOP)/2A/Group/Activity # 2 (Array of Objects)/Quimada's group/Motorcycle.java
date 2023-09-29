/**Authors:
Manolito Rey O. Quimada Jr.
Bennie Pinote
Ravenson Tayong
John Moses Puyot
**/

public class Motorcycle {
    private String name;
    private String color;
    private int powerSpeed;

    Motorcycle(String name, String color, int powerSpeed) {
        this.name = name;
        this.color = color;
        this.powerSpeed = powerSpeed;
    }

    // Getter and Setter for name
    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for startingAtSeconds
    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    // Getter and Setter for powerSpeed
    protected int getPowerSpeed() {
        return powerSpeed;
    }

    protected void setPowerSpeed(int powerSpeed) {
        this.powerSpeed = powerSpeed;
    }
}