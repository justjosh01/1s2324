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
        
        String[] itemNames = {"DRESS", "SKIRT", "TOPS"};
        Store[] storeArray = new Store[3];

        storeArray[0] = new Store();
        storeArray[1] = new Store();
        storeArray[2] = new Store();
        
        storeArray[0].setQuantity(5);
        storeArray[0].setPrice(150);
        storeArray[0].setSize(26);

        storeArray[1].setQuantity(6);
        storeArray[1].setPrice(35);
        storeArray[1].setSize(9);

        storeArray[2].setQuantity(2);
        storeArray[2].setPrice(75);
        storeArray[2].setSize(23);

        for (int i = 0; i < storeArray.length; i++) {
            System.out.println(itemNames[i] + " - Price: " + storeArray[i].getPrice() + ", Quantity: " + storeArray[i].getQuantity() + ", Size: " + storeArray[i].getSize());
        }
    }
}
