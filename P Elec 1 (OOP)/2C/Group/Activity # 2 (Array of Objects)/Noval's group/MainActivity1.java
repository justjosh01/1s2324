public class MainActivity1 {
//	Authors:
//	Jerwin Noval
//	Tristan Rey Vasquez
//	David Sun Damayo
//	Eufemia Moralde
	
	public static void main(String[] args) {
		
		Motorcycle m = new Motorcycle();
		Motorcycle m1 = new Motorcycle ("Suzuki", "Blue", 250);//object 1
		
		m.setBrand("Yamaha");
		m.setColor("Black");
		m.setPower(125);
		
		Motorcycle m2 = new Motorcycle("Harley Davidson", "Black", 1000); //object 2
		
		m2.setBrand("Honda");
		m2.setColor("red");
		m2.setPower(1000);
		
		Motorcycle m3 = new Motorcycle("Vespa", "White", 200); //object 3
		
		m3.setBrand("kawasaki");
		m3.setColor("Green");
		m3.setPower(600);
		
		System.out.println("---First Motorcycle---\n\n");
		System.out.println("Brand : " + m1.getBrand() + "\nColor : " + m1.getColor() + "\nPower : " + m1.getPower() + "\n\n");
		
		System.out.println("---Second Motorcycle---\n\n");
		System.out.println("Brand : " + m2.getBrand() + "\nColor : " + m2.getColor() + "\nPower : " + m2.getPower() + "\n\n");
		
		System.out.println("---Third Motorcycle---\n\n");
		System.out.println("Brand : " + m3.getBrand() + "\nColor : " + m3.getColor() + "\nPower : " + m3.getPower() + "\n\n");
	
//	m1.DisplayInfo();
//	m2.DisplayInfo();
//	m3.DisplayInfo();
	}
}
