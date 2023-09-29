import java.util.Scanner;

class MotorcycleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many motorcycles do you want to buy? ");
        int numMotorcycles = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to hold Motorcycle objects based on user input
        Motorcycle[] motorcycles = new Motorcycle[numMotorcycles];

        // Initialize the Motorcycle objects with default attributes
        for (int i = 0; i < numMotorcycles; i++) {
            Motorcycle motor = new Motorcycle();
            System.out.println("\nEnter details for Motorcycle " + (i + 1) + ":");
            System.out.print("Enter name: ");
            motor.setName(scanner.nextLine());
            System.out.print("Enter color: ");
            motor.setColor(scanner.nextLine());
            System.out.print("Enter power speed: ");
            motor.setPowerSpeed(scanner.nextLine());
            scanner.nextLine(); // Consume the newline character

            motorcycles[i] = new Motorcycle(name, color, powerSpeed);
        }

        // Close the scanner
        scanner.close();

        // Print the attributes of each motorcycle
        for (int i = 0; i < motorcycles.length; i++) {
            Motorcycle motor = motorcycles[i];
            System.out.println("\nMotorcycle " + (i + 1) + " Details:");
            System.out.println("Name: " + motor.getName());
            System.out.println("Color: " + motor.getColor());
            System.out.println("Power Speed: " + motor.getPowerSpeed());
            System.out.println();
        }
		if(numMotorcycles > 0) {
	  System.out.println("Congratulations! You already have " + numMotorcycles + " motorcycle"); 
	  }
	  
		  
	  }
    
}