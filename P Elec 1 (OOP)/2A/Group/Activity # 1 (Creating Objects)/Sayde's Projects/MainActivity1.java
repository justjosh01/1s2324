class Store {
    private int price;
    private int quantity;
    private int size;
    
    Store(){

    }
//constructor
    Store(int price, int quantity, int size) {
        
        this.price = price;
        this.size = size;
        this.quantity = quantity;
    }

    // Setter 
    protected void setPrice(int price) {
        this.price = price;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    // Getter 
    protected int getPrice() {
        return this.price;
    }

    protected int getSize() {
        return this.size;
    }

    protected int getQuantity() {
        return this.quantity;
    }
}

public class Main {

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
        
        System.out.println("Dress - Price: " + dress.getPrice() + ", Quantity: " + dress.getQuantity() + ", Size: " + dress.getSize());
        System.out.println("Socks - Price: " + socks.getPrice() + ", Quantity: " + socks.getQuantity() + ", Size: " + socks.getSize());
        System.out.println("Skirt - Price: " + skirt.getPrice() + ", Quantity: " + skirt.getQuantity() + ", Size: " + skirt.getSize());
    }
}
