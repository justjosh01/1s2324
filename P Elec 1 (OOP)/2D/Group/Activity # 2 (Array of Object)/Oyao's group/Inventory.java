/*
 * Oyao
 * Estanque
 * Rodriguez
 * Bacolod
 */
public class Inventory {
	private String itemName;
	private int itemQuantity;
	private double itemPrice;

	// Constructor
	Inventory() {
		System.out.println("Item has been created");
	}

	Inventory(String itemName, int itemQuantity, double itemPrice) {
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}

	// Getter for Name
	String getItemName() {
		return this.itemName;
	}

	// Setter for Name
	void setItemName(String itemName) {
		this.itemName = itemName;
	}

	// Getter for Quantity
	int getItemQuantity() {
		return this.itemQuantity;
	}

	// Setter for Quantity
	void setItemQuantity(int quantity) {
		this.itemQuantity = quantity;
	}

	// Getter for Price
	double getItemPrice() {
		return this.itemPrice;
	}

	// Setter for Price
	void setItemPrice(double price) {
		this.itemPrice = price;
	}

	// DisplayMethod
	void displayItem() {
		System.out.println(
				"Name: " + this.itemName + "\nQuantity: " + this.itemQuantity + "\nPrice: " + this.itemPrice + "\n");
	}
}
