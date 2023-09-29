class Person{
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class MainActivity2CJ{
    public static void main(String[] args) {
        // Create an array of Person objects
        Person[] people = new Person[3];

        // Initialize the array with Person objects
        people[0] = new Person();
        people[0].setName("Christian Joy Bugtong");
        people[0].setAge(19);

        people[1] = new Person();
        people[1].setName("Angelie Arranguez");
        people[1].setAge(20);

        people[2] = new Person();
        people[2].setName("Golden May Sarol");
        people[2].setAge(19);

        // Access and display information using getters
        for (Person person : people) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println();
        }
    }
}