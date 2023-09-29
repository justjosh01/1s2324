/*
    MEMBERS:
    SECUYA, JESSAH R.
    ROSELL, MARY GRACE M.
    TEJENO, JEANCIN S.
    SINANGOTE, BILMARK C.
*/
import java.util.Scanner;
public class MainActivity2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int size;
        String type;
        String mode;
        String route;

        //To know the size of an array
        System.out.print("How many transactions do you want to book? ");
        size = scanner.nextInt();

        //Declaring an Array object
        Transportation[] transpo = new Transportation[size];

        //Making an array of objects and storing
        for(int i=0; i<size; i++){
            transpo[i] = new Transportation();

            System.out.println("Transportation " + (i+1));
            System.out.print("Enter Type of Transportation: ");
            type=scanner.next();
            System.out.print("Enter Mode of Transportation: ");
            mode=scanner.next();
            System.out.print("Enter route: ");
            route=scanner.next();

            transpo[i].setTypeOfTransportation(type);
            transpo[i].setModeOfTransportation(mode);
            transpo[i].setRoute(route);

            System.out.println("Congrats you have successfully booked Transportation " + (i+1) + ".\n");
        }

        //printing or displaying the objects
        for(int i=0; i<size; i++){
            transpo[i].display(i+1);
        }
    }
}
