public class Racket {
	private String name;
	private String category;
	private int price;

	Racket() {

	}

	Racket(String name, String category, int price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}

	void setName(String name) {
		this.name = name;
	}

	void setCategory(String category) {
		this.category = category;
	}

	void setPrice(int price) {
		this.price = price;
	}

	String getName() {
		return this.name;
	}

	String getCategory() {
		return this.category;
	}

	int getPrice() {
		return this.price;
	}

	void display() {
		System.out.println("Name : " + this.name);
		System.out.println("Category : " + this.category);
		System.out.println("Price : " + this.price + "\n");
	}
}
