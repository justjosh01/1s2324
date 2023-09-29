class Notebook {

	private String brand;
	private String color;
	private int leaves;

	// Constructor
	Notebook() {
		System.out.println("Notebook has been created!");
	}

	Notebook(String brand, String color, int leaves) {
		this.brand = brand;
		this.color = color;
		this.leaves = leaves;
	}

	// setter
	void setBrand(String brand) {
		this.brand = brand;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setLeaves(int leaves) {
		this.leaves = leaves;
	}

	// getter
	String getBrand() {
		return this.brand;
	}

	String getColor() {
		return this.color;
	}

	int getLeaves() {
		return this.leaves;
	}

	void getNotebook() {
		System.out.println("Notebook()");
	}

	void displayInfo() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Color: " + this.color);
		System.out.println("Leaves: " + this.leaves);
	}

}
