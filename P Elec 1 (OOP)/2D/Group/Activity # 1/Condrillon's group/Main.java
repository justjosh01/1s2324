public class Main {
    public static void main(String[] args) {

        Person person = new Person("Chris Deo Caldiro", 19, "Suba");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}