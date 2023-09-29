public class Dogs4Sale {
    // Private attributes
    private String breed;
    private double price;
    private String name;

	//default constructor 
	Dogs4Sale(){
		System.out.println("=================================");
		System.out.println("OBJECTS OF DOG FOR SALE CREATED ");
		System.out.println("=================================");
	}
    // Constructor
    public Dogs4Sale(String name, double price, String breed) {
        this.name = name;
        this.price = price;
        this.breed= breed;
    }
	// Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Name
    public String getName() {
        return name;
    }
    // Setter for Price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for Price
    public double getPrice() {
        return price;
    }
	// Setter for Breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter for Breed
    public String getBreed() {
        return breed;
    }
  void DisplayInfo (){
	   System.out.println("Name: "+getName());
	   System.out.println("Price: " +getPrice());
	   System.out.println("Breed: " +getBreed());
	   System.out.println();
  }

}
