public class Drinks {
	
	//attributes	
	private String softdrinks;
	private String milk;
	private String juice;
	
	//constructor
	Drinks(String softdrinks, String milk, String juice){
		this.softdrinks = softdrinks;
		this.milk = milk;
		this.juice = juice;		
		
		System.out.println("Object Drinks has been Created!");
		System.out.println(softdrinks + " Created");
		System.out.println(milk + " Created");
		System.out.println(juice + " Created");
		System.out.println();

	}
	
	// setters
	protected void editSoftdrinks(String softdrinks) {
		this.softdrinks = softdrinks;	
	}
	
	protected void editMilk(String milk) {
		this.milk = milk;
	}
	
	protected void editJuice(String juice) {
		this.juice = juice;
	}
	
	//getters
	protected String readSoftdrinks() {
		return softdrinks;
	}
	
	protected String readMilk() {
		return milk;
	}
	
	protected String readJuice() {
		return juice;
	}

}
