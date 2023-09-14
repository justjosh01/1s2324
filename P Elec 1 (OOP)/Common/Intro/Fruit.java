class Fruit {
    private String name;
    private String color;
    private int size;

    // constructor
    protected Fruit() {
        System.out.println("Fruit object has been created");
    };

    protected Fruit(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
        System.out.println("Fruit object w/ default values has been created");
    }

    // setters
    protected void setName(String name) {
        this.name = name;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    // getters
    protected String getName() {
        return this.name;
    }

    protected String getColor() {
        return this.color;
    }

    protected int getSize() {
        return this.size;
    }
}