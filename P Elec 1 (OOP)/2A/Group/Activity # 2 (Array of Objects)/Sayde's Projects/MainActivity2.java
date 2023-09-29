import java.util.Scanner;
public class StoreMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.println("Welcome Admin! This is where you set your items' price, quantity and sizes");
        System.out.print("Enter how many items you like: ");
        int numItems = scanner.nextInt();
        
        Store[] items = new Store[numItems];

        for (int i = 0; i < numItems; i++) {
            scanner.nextLine();
            
            System.out.println("Enter details for item " + (i + 1) );               System.out.print("Enter item: ");
            String item = scanner.nextLine();
            System.out.print("Enter price: ");
            int price = scanner.nextInt();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter size: ");
            String size = scanner.nextLine();

            items[i] = new Store(item, price, quantity, size);
        }

        System.out.println();
        System.out.println("Items Information: ");
    System.out.println();

        for (int i = 0; i < numItems; i++) {
            System.out.println("Item " + (i + 1) + ":");
            System.out.println("Item: " + items[i].getItem());
            System.out.println("Price: " + items[i].getPrice());
            System.out.println("Quantity: " + items[i].getQuantity());
            System.out.println("Size: " + items[i].getSize());
        }
    
   }
}
