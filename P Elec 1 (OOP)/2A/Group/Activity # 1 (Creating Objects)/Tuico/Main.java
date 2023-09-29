 import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        carSelect();
    }

    static void carSelect(){

    Scanner input = new Scanner(System.in);

    int carChoice;
    Car honda = new Car();
    Car toyota = new Car();
    Car audi = new Car();

        System.out.print("[1]HONDA\n[2]TOYOTA\n[3]AUDI\n[0]EXIT\n");
        System.out.print("Pick a car : ");
        carChoice = input.nextInt();
        if(carChoice == 1){
            honda.Car("Honda","Yellow" , 200);
            
            promptEnterKey();
            carSelect();
        }
        else if(carChoice == 2){
            toyota.Car("Toyota","Red" , 160);
           
            promptEnterKey();
            carSelect();
        }
        else if(carChoice == 3){
            audi.Car("Audi","Black" , 180);
            
            promptEnterKey();
            carSelect();
        }
        else if (carChoice == 0){
            System.out.println("HOPE YOU PICK THE CAR THAT YOU LIKE!!");
            System.exit(0);
        }
        else{
            System.out.println("{PLEASE ENTER A VALID CAR NO.]");
    
            promptEnterKey();
            carSelect();

        }
    }
    static void promptEnterKey(){
    System.out.println("Press \"ENTER\" to pick another car...");
    
    try {
        System.in.read();
        clearScreen();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}