class Car {
    private String brand;
    private String color;
    private int speed;

    // constructor
    Car() {
        System.out.println("Car object has been created");
    }

    Car(String brand, String color, int speed) {
        System.out.println("Car object (w/ default values) has been created");
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    // setters -> edit or update or change
    void setBrand(String brand) {
        this.brand = brand;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    // getters -> read or retrieve
    String getBrand() {
        return this.brand;
    }

    String getColor() {
        return this.color;
    }

    int getSpeed() {
        return this.speed;
    }

    // custom methods
    void displayInfo() {
        System.out.println("\nBrand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.speed);
    }

    void brake() {
        System.out.println(this.brand + " \n");
    }
}
