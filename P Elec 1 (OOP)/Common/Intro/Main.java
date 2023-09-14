class Main {
    public static void main(String args[]) {
        Car audi = new Car("Audi", "White", 80);
        Car volvo = new Car("Volvo", "Black", 100);
        Car toyota = new Car("Toyota", "Red", 120);
        Car ferrari = new Car();
        audi.displayInfo();
        volvo.displayInfo();
        toyota.displayInfo();

    }
}
