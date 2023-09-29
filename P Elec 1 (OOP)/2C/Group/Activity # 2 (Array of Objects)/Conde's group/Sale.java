class Sale {
    private String productName;
    private double price;
    private int quantity;

    Sale() {

    }

    Sale(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void displayInfo() {
        System.out.println("\t\t\t\t" + productName + "            " + price + "       " + quantity);
        System.out.println();
    }
}
