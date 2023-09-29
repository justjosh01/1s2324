public class Main {

	public static void main(String[] args) {
		
		Drinks d = new Drinks("softdrinks", "milk", "juice");
		
		
	
		d.editSoftdrinks("Milktea");
		String drink = d.readSoftdrinks();
		
		d.editMilk("Yakult");
		String drink1 = d.readMilk();
		
		d.editJuice("Slurpee");
		String drink2 = d.readJuice();
		
		System.out.println("New Object Created!");
		System.out.println(drink);
		System.out.println(drink1);
		System.out.println(drink2);

	}

}