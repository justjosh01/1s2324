public class MainActivity1 {

	public static void main(String[] args) {

		Racket donic = new Racket("donic", "Table Tennis", 1000);

		System.out.println("Name: " + donic.getName());
		System.out.println("Category: " + donic.getCategory());
		System.out.println("Price: " + donic.getPrice() + "\n");

		// display
		Racket sanwei = new Racket("Sanwei-T88 3", "Table Tennis", 500);
		sanwei.display();

		// setter
		Racket butterfly = new Racket("Tenergy", "Table Tennis", 1500);
		butterfly.display();

		butterfly.setName("Tenergy 05");
		butterfly.setCategory("Table Tennis");
		butterfly.setPrice(2000);

		butterfly.display();

		Racket yonex = new Racket();

		yonex.setName("Yonex");
		yonex.setCategory("Badminton");
		yonex.setPrice(4000);

		System.out.println("Name: " + yonex.getName());
		System.out.println("Category: " + yonex.getCategory());
		System.out.println("Price: " + yonex.getPrice() + "\n");

	}

}
