class Tshirt {
  private String brand;
  private String color;
  private int quantity;

  // constructor
  public Tshirt() {

  }

  public Tshirt (String brand, String color, int quantity) {
    System.out.println(" Tshirt object has been created.");
    this.brand = brand;
    this.color = color;
    this.quantity = quantity;

  }

  // getters

  public String getBrand() {
    return this.brand;
  }

  public String getColor() {
    return this.color;
  }

  public int getQuantity() {
    return this.quantity;
  }
  // setters

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}

     