// Main class
public class Main {
    public static void main(String[] args) {
        // Create three objects of MyClass
        MyClass obj1 = new MyClass("John", 30, 50000.0); // Create object 1 with specific values
        MyClass obj2 = new MyClass("Alice", 25, 60000.0); // Create object 2 with specific values
        MyClass obj3 = new MyClass("Bob", 35, 75000.0); // Create object 3 with specific values

        // Accessing and printing attributes using getters
        System.out.println(
                "Object 1: Name=" + obj1.getName() + ", Age=" + obj1.getAge() + ", Salary=" + obj1.getSalary());
        System.out.println(
                "Object 2: Name=" + obj2.getName() + ", Age=" + obj2.getAge() + ", Salary=" + obj2.getSalary());
        System.out.println(
                "Object 3: Name=" + obj3.getName() + ", Age=" + obj3.getAge() + ", Salary=" + obj3.getSalary());
        // Print the attributes of objects 1, 2, and 3 using their respective getter
        // methods
    }
}