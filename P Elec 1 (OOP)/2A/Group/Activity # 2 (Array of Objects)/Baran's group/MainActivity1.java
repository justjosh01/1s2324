
public class MainActivity1 {

    public static void main(String[] args) {

        Store dress = new Store();
        Store socks = new Store();
        Store skirt = new Store();

        dress.setQuantity(5);
        dress.setPrice(150);
        dress.setSize(26);

        socks.setQuantity(6);
        socks.setPrice(35);
        socks.setSize(9);

        skirt.setQuantity(2);
        skirt.setPrice(75);
        skirt.setSize(23);

        System.out.println("Dress - Price: " + dress.getPrice() + ", Quantity: " + dress.getQuantity() + ", Size: "
                + dress.getSize());
        System.out.println("Socks - Price: " + socks.getPrice() + ", Quantity: " + socks.getQuantity() + ", Size: "
                + socks.getSize());
        System.out.println("Skirt - Price: " + skirt.getPrice() + ", Quantity: " + skirt.getQuantity() + ", Size: "
                + skirt.getSize());
    }
}
