/*
Authors:
Rey-ann Punay
Sheena Daclan
Sheena Marie Aniban
*/

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee() {
        this.name = "Sheena1";
        this.age = 20;
        this.salary = 100000;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

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

    public String toString() {
        return String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
    }
}