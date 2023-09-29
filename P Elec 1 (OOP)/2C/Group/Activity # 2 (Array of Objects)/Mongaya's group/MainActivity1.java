// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainActivity1 {
    public static void main(String[] args) {
        Person abigail = new Person();
        Person reynaliza = new Person();
        Person kerstine = new Person();

        abigail.setName("Abigail");
        abigail.setAge(20);
        abigail.setAddress("Maharuhay Medellin Cebu");

        reynaliza.setName("Reynaliza");
        reynaliza.setAge(19);
        reynaliza.setAddress("Maharuhay Medellin Cebu");

        kerstine.setName("Kerstine");
        kerstine.setAge(19);
        kerstine.setAddress("Paypay Daanbantayan Cebu");


        System.out.println("Name: " + abigail.getName() +", Age: " + abigail.getAge() + ", Address: " + abigail.getAddress());
        System.out.println("Name: " + reynaliza.getName() + ", Age: " +  reynaliza.getAge() + ", Address: " + reynaliza.getAddress());
        System.out.println("Name: " + kerstine.getName()+ ", Age: " + kerstine.getAge() + ", Address: " + kerstine.getAddress());
    }
}