class Second {
    private int x;
    private int y;

    // constructor
    Second() {
        System.out.println("Object second has been created");
    }

    Second(int x, int y) {
        System.out.println("Object second (w/ default) has been created");
        this.x = x;
        this.y = y;
    }

    // setters -> edit or update or change
    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }

    // getters -> retrieve or read
    protected int getX() {
        return this.x;
    }

    protected int getY() {
        return this.y;
    }
}
