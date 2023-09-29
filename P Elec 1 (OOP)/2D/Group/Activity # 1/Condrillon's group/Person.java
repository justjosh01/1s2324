public class Person {
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}