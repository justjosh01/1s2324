public class Motorcycle {
	
	private String brand;
	private String color;
	private int power;
	
	Motorcycle (){
//		Authors:
//			Jerwin Noval
//			Tristan Rey Vasquez
//			David Sun Damayo
//			Eufemia Moralde
	}
	Motorcycle (String brand, String color, int power){
		
		this.brand = brand;
		this.color = color;
		this.power = power;
	}
	//setters
	void  setBrand (String brand) {
		this.brand = brand;
	}
	void setColor (String color) {
		this.color = color;
	}
	void setPower (int power) {
		this.power = power;
	}
	//getters
	String getBrand() {
		return this.brand;
	}
	String getColor() {
		return this.color;
	}
	int getPower() {
		return this.power;
	}
}