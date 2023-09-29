class Fashion {
    private String name;
    private String category;
    private double price;

    // Constructor
    public Fashion(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Example usage
    public static void main(String[] args) {
        // Create a Fashion object
        Fashion fashionItem = new Fashion("Sneakers", "Footwear", 50.00);

        // Get attributes
        System.out.println("Name: " + fashionItem.getName());
        System.out.println("Category: " + fashionItem.getCategory());
        System.out.println("Price: $" + fashionItem.getPrice());

        // Update attributes
        fashionItem.setName("High Heels");
        fashionItem.setCategory("Footwear");
        fashionItem.setPrice(80.00);

        // Get updated attributes
        System.out.println("\nUpdated Attributes:");
        System.out.println("Name: " + fashionItem.getName());
        System.out.println("Category: " + fashionItem.getCategory());
        System.out.println("Price: $" + fashionItem.getPrice());
    }
}