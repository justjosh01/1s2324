import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String address;

    // Constructor
    protected Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods
    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected String getAddress() {
        return address;
    }

    // Setter methods
    protected void setName(String name) {
        this.name = name;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected	 void setAddress(String address) {
        this.address = address;
    }
}

public class StudentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you want to enter? ");
        int numStudents = scanner.nextInt();

        // Create an array of Student objects
        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); // Consume newline left by nextInt()
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline left by nextInt()
            System.out.print("Address: ");
            String address = scanner.nextLine();

            // Create a new Student object and add it to the array
            students[i] = new Student(name, age, address);
        }

        // Display the student details
        System.out.println("\nStudent Details:");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Age: " + students[i].getAge());
            System.out.println("Address: " + students[i].getAddress());
            System.out.println();
        }

        scanner.close();
    }
}