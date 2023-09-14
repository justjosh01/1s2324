class Employee {
  private String name;
  private int age;
  private double salary;

  // constructor
  public Employee() {

  }

  public Employee(String name, int age, double salary) {
    System.out.println("Employee's object has been created.");
    this.name = name;
    this.age = age;
    this.salary = salary;

  }

  // getters

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public double getSalary() {
    return this.salary;
  }
  // setters

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}

public class Main {
  public static void main(String[] args) {
    Employee employee1 = new Employee("John Doe", 40, 20000);
    employee1.setName("Rey-ann");
    employee1.setAge(32);
    employee1.setSalary(100000);

    Employee employee2 = new Employee();
    employee2.setName("Sheena Marie");
    employee2.setAge(20);
    employee2.setSalary(80000);

    Employee employee3 = new Employee();
    employee3.setName("Sheena");
    employee3.setAge(20);
    employee3.setSalary(120000);

    System.out.println("Employee1: " + employee1.getName() + " is at the age of " + employee1.getAge()
        + " and has a salary of " + employee1.getSalary());

    System.out.println("Employee2: " + employee2.getName() + " is at the age of " + employee2.getAge()
        + " and has a salary of " + employee2.getSalary());

    System.out.println("Employee3: " + employee3.getName() + " is at the age of " + employee3.getAge()
        + " and has a salary of " + employee3.getSalary());

  }
}