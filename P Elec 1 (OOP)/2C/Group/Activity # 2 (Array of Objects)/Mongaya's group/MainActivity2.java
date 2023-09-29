/*
    Author/s:
    Abiegail Mapula
    Reynaliza Montesclaros
    Kerstine Rodrigo
    Reliza Mongaya
*/
import java.util.Scanner;

public class MainActivity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many person do you want to create?: ");
        int numPeople = scanner.nextInt();

        Person[] peopleRecords = new Person[numPeople];

        for (int i = 0; i < numPeople; i++) {
            peopleRecords[i] = new Person();
            System.out.println("\nInput for person" + (i + 1));

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            //scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.next();

            peopleRecords[i].setName(name);
            peopleRecords[i].setAge(age);
            peopleRecords[i].setAddress(address);

            //peopleRecords[i] = new Person(name, age, address);
        }
        System.out.println("Congratulations you have successfully created " + numPeople + " persons record.\n");
        System.out.println("\nPerson records: ");
        for (int i = 0; i < numPeople; i++) {
            System.out.println("Name: " + peopleRecords[i].getName());
            System.out.println("Age: " + peopleRecords[i].getAge());
            System.out.println("Address: " + peopleRecords[i].getAddress());
            System.out.println();
        }
      // scanner.close();

    }
}
