class Store {
    private int price;
    private int quantity;
    private String size;

    // constructor
    Store() {

    }

    // constructor
    Store(int price, int quantity, String size) {

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

    protected void setSize(String size) {
        this.size = size;
    }

    // Getter
    protected int getPrice() {
        return this.price;
    }

    protected String getSize() {
        return this.size;
    }

    protected int getQuantity() {
        return this.quantity;
    }
}
