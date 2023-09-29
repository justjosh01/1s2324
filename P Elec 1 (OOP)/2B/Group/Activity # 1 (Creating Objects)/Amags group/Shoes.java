public class Shoes {
    private String brand;
    private String color;
    private int size;

    // Constructor
    public Shoes(String brand, String color, int size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    // Getters and setters
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {

        Shoes shoes = new Shoes("Nike", "Rainbow", 36);

        shoes.setBrand("Nike");
        shoes.setColor("White");
        shoes.setSize(36);

        System.out.println("Brand: " + shoes.getBrand());
        System.out.println("Color: " + shoes.getColor());
        System.out.println("Size: " + shoes.getSize());

    }
}