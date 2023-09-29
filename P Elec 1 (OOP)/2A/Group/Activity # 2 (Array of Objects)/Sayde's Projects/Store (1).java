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
