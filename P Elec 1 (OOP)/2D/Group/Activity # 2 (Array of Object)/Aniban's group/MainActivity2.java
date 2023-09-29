import java.util.Scanner;

public class MainActivity2 {

    private int no;
    private String name;
    private int age;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("No.: " + no);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        int loop, num;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many employees do you want?: ");
        num = scan.nextInt();

        MainActivity2[] employee = new MainActivity2[num];

        for (loop = 0; loop < employee.length; loop++) {
            employee[loop] = new MainActivity2(loop + 1);
        }

        for (loop = 0; loop < employee.length; loop++) {
            System.out.println("\n○●○Input for employee " + (loop + 1) + "...\n");

            System.out.print("Name: ");
            employee[loop].setName(scan.next());

            System.out.print("Age: ");
            employee[loop].setAge(scan.nextInt());

            System.out.print("Salary: ");
            employee[loop].setSalary(scan.nextDouble());

            System.out.println("\n");
            employee[loop].display();
        }

        System.out.println("\nCongratulations! (*^▽^)/★*☆♪ You have successfully employed...\n");
        for (loop = 0; loop < employee.length; loop++) {
            employee[loop].display();
        }
    }
}