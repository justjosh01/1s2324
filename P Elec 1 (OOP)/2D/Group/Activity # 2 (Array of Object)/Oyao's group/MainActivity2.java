import java.util.Scanner;

public class MainActivity2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        
        System.out.print("How many item you want to store: ");
        size = input.nextInt();

        Inventory[] storage = new Inventory[size];

        for(int i = 0; i < size; i++){

            storage[i] = new Inventory();

            System.out.println("Input Item " + (i+1));

            System.out.printf("Item %d name: ", (i+1));
            storage[i].setItemName(input.next());
            
            System.out.printf("Item %d price: ", (i+1));
            storage[i].setItemPrice(input.nextDouble());

            System.out.printf("Item %d quantity: ", (i+1));
            storage[i].setItemQuantity(input.nextInt());
            
            System.out.println("Item Stored!!");
            System.out.println();
        }
        
        for(int i=0; i<size; i++){
            System.out.println();
            System.out.println("===========================");
            storage[i].displayItem();
            System.out.println("===========================");
        }

    }
}
