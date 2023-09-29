class MotorcycleApp {
    public static void main(String[] args) {
        // Create instances of Motorcycle with attributes
        Motorcycle motor1 = new Motorcycle("Honda", "Red", 125);
        Motorcycle motor2 = new Motorcycle("Yamaha", "Black", 150);
        Motorcycle motor3 = new Motorcycle("Skygo", "White", 170);

        // Access and modify the attributes of each motorcycle using setters and getters

        // Modify attributes for the first motorcycle (motor1)
        System.out.println("Original Motorcycle Name: " + motor1.getName());
        System.out.println("Original Color: " + motor1.getColor());
        System.out.println("Original Power Speed: " + motor1.getPowerSpeed());

        motor1.setName("Harley Davidson");
        motor1.setColor("Blue");
        motor1.setPowerSpeed(220);

        // Access the modified attributes for the first motorcycle
        System.out.println("\nModified Motorcycle Name: " + motor1.getName());
        System.out.println("Modified Color: " + motor1.getColor());
        System.out.println("Modified Power Speed: " + motor1.getPowerSpeed());

        // Modify attributes for the second motorcycle (motor2)
        System.out.println("\nOriginal Motorcycle Name: " + motor2.getName());
        System.out.println("Original Color: " + motor2.getColor());
        System.out.println("Original Power Speed: " + motor2.getPowerSpeed());

        motor2.setName("Rusi");
        motor2.setColor("Gray");
        motor2.setPowerSpeed(203);

        // Access the modified attributes for the second motorcycle
        System.out.println("\nModified Motorcycle Name: " + motor2.getName());
        System.out.println("Modified Color: " + motor2.getColor());
        System.out.println("Modified Power Speed: " + motor2.getPowerSpeed());

        // Modify attributes for the third motorcycle (motor3)
        System.out.println("\nOriginal Motorcycle Name: " + motor3.getName());
        System.out.println("Original Color: " + motor3.getColor());
        System.out.println("Original Power Speed: " + motor3.getPowerSpeed());

        motor3.setName("Tesla Motors");
        motor3.setColor("Maroon");
        motor3.setPowerSpeed(190);

        // Access the modified attributes for the third motorcycle
        System.out.println("\nModified Motorcycle Name: " + motor3.getName());
        System.out.println("Modified Color: " + motor3.getColor());
        System.out.println("Modified Power Speed: " + motor3.getPowerSpeed());
    }
}