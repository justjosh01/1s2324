public class Main {

	public static void main(String[] args) {
		
		Drinks d = new Drinks("Softdrinks", "Coca-Cola", "30");
		Drinks d1 = new Drinks("Milk", "Bear-brand", "50");
		Drinks d2 = new Drinks("Juice", "Tang", "33");
		
		// modify the identifier d using setters and getters	
		d.editKinds("Coffee");
		String drinkType = d.readKinds();
		
		d.editBrand("Kopiko");
		String newBrand = d.readBrand();
		
		d.editPrice("10");
		String newPrice = d.readPrice();
		
		// modifier identifier d1 using setters and getters
		d1.editKinds("Beer");
		String drinkType1 = d1.readKinds();
		
		d1.editBrand("Red Horse");
		String newBrand1 = d1.readBrand();
		
		d1.editPrice("70");
		String newPrice1 = d1.readPrice();
		
		// modifier identifier d2 using setters and getters
		d2.editKinds("Tea");
		String drinkType2 = d2.readKinds();
		
		d2.editBrand("Lipton");
		String newBrand2 = d2.readBrand();
		
		d2.editPrice("90");
		String newPrice2 = d2.readPrice();
					
		
		System.out.println("New Object Created!");
		System.out.println("Kind of drinks: " + drinkType);
		System.out.println("Brand Name: " + newBrand);
		System.out.println("Price each: " + newPrice);
		System.out.println();
		System.out.println("New Object Created!");
		System.out.println("Kind of drinks: " + drinkType1);
		System.out.println("Brand Name: " + newBrand1);
		System.out.println("Price each: " + newPrice1);
		System.out.println();
		System.out.println("New Object Created!");
		System.out.println("Kind of drinks: " + drinkType2);
		System.out.println("Brand Name: " + newBrand2);
		System.out.println("Price each: " + newPrice2);

	}

}