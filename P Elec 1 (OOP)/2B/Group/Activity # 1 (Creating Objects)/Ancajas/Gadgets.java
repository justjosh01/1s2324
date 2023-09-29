public class Gadgets {
    private String brand;
    private String color;
    private String type;

    public Gadgets(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    // setter
    protected void setBrand(String brand) {
        this.brand = brand;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected void setType(String type) {
        this.type = type;
    }

    // getter
    protected String getBrand() {
        return brand;
    }

    protected String getColor() {
        return color;
    }

    protected String getType() {
        return type;
    }

    public static void main(String[] args) {

        Gadgets gadgets = new Gadgets("Apple", "Black", "Macbook");

        Gadgets gadgets2 = new Gadgets("Oppo", "White", "Android");

        Gadgets gadgets3 = new Gadgets("Samsung", "Silver", "Tablet");
        // Gadgets g = new Gadgets();
        System.out.println("Brand: " + gadgets.getBrand());
        System.out.println("Color: " + gadgets.getColor());
        System.out.println("Type: " + gadgets.getType());

        System.out.println("\n\nBrand: " + gadgets2.getBrand());
        System.out.println("Color: " + gadgets2.getColor());
        System.out.println("Type: " + gadgets2.getType());

        System.out.println("\n\nBrand: " + gadgets3.getBrand());
        System.out.println("Color: " + gadgets3.getColor());
        System.out.println("Type: " + gadgets3.getType());

    }
}