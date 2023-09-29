import java.util.Scanner;

public class MainActivity1 {

    public static void main(String[] args) {
	    
			Scanner input = new Scanner(System.in);
			
			Inventory Item1 = new Inventory();
			Inventory Item2 = new Inventory();
			Inventory Item3 = new Inventory();
			
			System.out.println("\n\nINVENTORY!!!");
		    
			System.out.println("\nInput Item1 for Storage.");
			
			System.out.print("Name: ");
			Item1.setItemName(input.next());
			
			System.out.print("Quantity: ");
		    Item1.setItemQuantity(input.nextInt());
		    
		    System.out.print("Price: ");
		    Item1.setItemPrice(input.nextDouble());
		    
		    System.out.println("\n\nInput Item2 for Storage.");
		    
		    System.out.print("Name: ");
		    Item2.setItemName(input.next());
		    
		    System.out.print("Quantity: ");
		    Item2.setItemQuantity(input.nextInt());
		    
		    System.out.print("Price: ");
		    Item2.setItemPrice(input.nextDouble());
		    
		    
		    		
		    System.out.println("\n\nInput Item3 for Storage.");
		    System.out.print("Name: ");
		    Item3.setItemName(input.next());
		    
		    System.out.print("Quantity: ");
		    Item3.setItemQuantity(input.nextInt());
		    
		    System.out.print("Price: ");
		    Item3.setItemPrice(input.nextDouble());
		    
		    System.out.println("\nItem 1");
		    Item1.displayItem();
		    System.out.println("\nItem 2");
		    Item2.displayItem();
		    System.out.println("\nItem 3");
		    Item3.displayItem();
	    }
}
