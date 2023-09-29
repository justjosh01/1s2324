// Our custom class
class MyClass {
    // Private instance variables to store data
    private String name; // Variable to store the name
    private int age; // Variable to store the age
    private double salary; // Variable to store the salary

    // Constructor to initialize object with values
    public MyClass(String name, int age, double salary) {
        this.name = name; // Initialize 'name' with the provided value
        this.age = age; // Initialize 'age' with the provided value
        this.salary = salary; // Initialize 'salary' with the provided value
    }

    // Getter and setter for 'name'
    public String getName() {
        return name; // Return the value of 'name'
    }

    public void setName(String name) {
        this.name = name; // Set the value of 'name' to the provided value
    }

    // Getter and setter for 'age'
    public int getAge() {
        return age; // Return the value of 'age'
    }

    public void setAge(int age) {
        this.age = age; // Set the value of 'age' to the provided value
    }

    // Getter and setter for 'salary'
    public double getSalary() {
        return salary; // Return the value of 'salary'
    }

    public void setSalary(double salary) {
        this.salary = salary; // Set the value of 'salary' to the provided value
    }
}
