// MotorcycleApp.java (Access the Motorcycle class with the updated attributes and setters/getters)
 class MotorcycleApp {
    public static void main(String[] args) {
        // Create instances of Motorcycle with attributes
        Motorcycle honda = new Motorcycle("Honda", 2, 200);
        Motorcycle yamaha = new Motorcycle("Yamaha", 3, 180);
		Motorcycle skygo = new Motorcycle("Skygo",5, 1000);

        // Access and display the attributes using getters
        System.out.println("Motorcycle Name: " + honda.getName());
        System.out.println("Starting at Seconds: " + honda.getStartingAtSeconds());
        System.out.println("Power Speed: " + honda.getPowerSpeed());

        System.out.println("Motorcycle Name: " + yamaha.getName());
        System.out.println("Starting at Seconds: " + yamaha.getStartingAtSeconds());
        System.out.println("Power Speed: " + yamaha.getPowerSpeed());
		
		System.out.println("Motorcycle Name: " + skygo.getName());
        System.out.println("Starting at Seconds: " + skygo.getStartingAtSeconds());
        System.out.println("Power Speed: " + skygo.getPowerSpeed());
    }
}

