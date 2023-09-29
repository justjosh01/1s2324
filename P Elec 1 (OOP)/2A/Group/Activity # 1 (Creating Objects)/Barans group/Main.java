
public class Main {

    public static void main(String[] args) {

        Store dress = new Store();
        Store socks = new Store();
        Store skirt = new Store();

        dress.setQuantity(5);
        dress.setPrice(150);
        dress.setSize("M");

        socks.setQuantity(6);
        socks.setPrice(35);
        socks.setSize("S");

        skirt.setQuantity(2);
        skirt.setPrice(75);
        skirt.setSize("S");

        System.out.println("Dress - Price: " + dress.getPrice() + ", Quantity: " + dress.getQuantity() + ", Size: "
                + dress.getSize());
        System.out.println("Socks - Price: " + socks.getPrice() + ", Quantity: " + socks.getQuantity() + ", Size: "
                + socks.getSize());
        System.out.println("Skirt - Price: " + skirt.getPrice() + ", Quantity: " + skirt.getQuantity() + ", Size: "
                + skirt.getSize());
    }
}
