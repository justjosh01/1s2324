public class MainActivity1 {
    public static void main(String[] args) {
        Sale sale1 = new Sale("Lucky Me", 10, 2);
        Sale sale2 = new Sale("Burger", 40, 3);
        Sale sale3 = new Sale("Pizza", 100, 5);

        sale1.setProductName("QuicChow");
        sale1.setPrice(10);
        sale1.setQuantity(3);

        sale2.setProductName("Footlong");
        sale2.setPrice(30);
        sale2.setQuantity(5);

        sale3.setProductName("Coca-Cola");
        sale3.setPrice(40);
        sale3.setQuantity(8);

        System.out.println("\t\t\t\t*This is our simple program for Java OOP*");
        System.out.println("\t\t======================================================================");
        System.out.println("\t\t\t\tItem            |  Price   |   Quantity");
        System.out.println("\t\t======================================================================");
        sale1.displayInfo();
        sale2.displayInfo();
        sale3.displayInfo();
    }
}
