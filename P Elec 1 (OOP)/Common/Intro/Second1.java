class Second {
    private int y;
    private int x;

    Second() {
    }

    Second(int y) {
        this.y = y;
        // System.out.println("Object Second has been created.");
    }

    // setters
    void updateX(int x) {// set/edit/update
        this.x = x;
    }

    // getters
    int getX() {// retrieve value
        return this.x;
    }
    // void hello() {
    // System.out.println("Hello MY World");
    // }
}
