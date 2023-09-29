public class Main {
    public static void main(String[] args) {
    
        // Create three objects of Person
        Person mariaJeva = new Person();
        mariaJeva.setName("Maria Jeva Ngojo");
        mariaJeva.setAge(19);
        mariaJeva.setAddress("Dalinding, Daanbantayan");

        Person christianJoy = new Person();
        christianJoy.setName("Christian Joy Bugtong");
        christianJoy.setAge(19);
        christianJoy.setAddress("Tominjao, Daanbantayan");

        Person angelie = new Person();
        angelie.setName("Angelie Arranguez");
        angelie.setAge(20);
        angelie.setAddress("Paypay, Daanbantayan");

        Person regine = new Person();
        regine.setName("Regine Jucdong");
        regine.setAge(19);
        regine.setAddress("Dalinding, Daanbantayan");

        // Print information for each person
        printPersonInfo(mariaJeva);
        printPersonInfo(christianJoy);
        printPersonInfo(angelie);
        printPersonInfo(regine);
    }

    public static void printPersonInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
        System.out.println();
    }
}
