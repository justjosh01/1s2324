/**
 * LEONIDES G. CONDE JR.
 * DAVE ANTON MAPAIT
 * JANE OLASIMAN
 * JADE EMMARIE ARREGLO
 **/
package mainactivity2;

import java.util.Scanner;

public class MainActivity2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input of sales record to create: ");
        int numSales = sc.nextInt();
        
        Sale[] sales = new Sale[numSales];
        
        for(int i=0; i<numSales; i++){
            System.out.println();
            System.out.println("Sale value No. " + (i+1));
            sc.nextLine();
            System.out.print("Input product name: ");
            String productName = sc.nextLine();
            System.out.print("Input product price: $");
            double price = sc.nextDouble();
            System.out.print("Input quantity sold: ");
            int quantity = sc.nextInt();
            sales[i] = new Sale(productName, price, quantity);
        }
        
        System.out.println();
        System.out.println("Sales Record Created:");
        System.out.println("\t\t\t\t*This is our simple program for Java OOP*");
        System.out.println("\t\t======================================================================");
        System.out.println("\t\t\t\tItem            |  Price   |   Quantity");
        System.out.println("\t\t======================================================================");

        for(Sale sale : sales){
            sale.displayInfo();
        }
    }
    
}
