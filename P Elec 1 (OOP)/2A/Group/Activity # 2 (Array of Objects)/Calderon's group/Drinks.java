/*
Authors	:  	
		 Christian Calderon
                 Emmanuel Phillip Godin
                 Roland Abellanosa
                 Christopher Aluba
*/
class Drinks {

    private String kinds;
    private String brand;
    private int price;

    Drinks(String kinds, String  brand, int price) {
        this.kinds = kinds;
        this.brand = brand;
        this.price = price;
        
        System.out.println("Object Drinks has been Created!");
		System.out.println("Kind of drinks : " + kinds);
		System.out.println("Brand Name : " + brand);
		System.out.println("Price Each : " + price);
		System.out.println();
    }
    
    
    // setters
    protected void editKinds(String kinds) {
        this.kinds = kinds;
    }

    protected void editBrand(String brand) {
        this.brand = brand;
    }

    protected void editPrice(int price) {
        this.price = price;
    }

    // getters
    protected String readKinds() {
        return kinds;
    }

    protected String readBrand() {
        return brand;
    }

    protected int readPrice() {
        return price;
    }
}

