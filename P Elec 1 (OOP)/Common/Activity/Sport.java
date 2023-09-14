public class Sport {
    protected String name;
    protected String category;
    protected int numberOfPlayers;
    protected String location;

    // getters
    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public int getNumberOfPlayers() {
        return this.numberOfPlayers;
    }

    public String getLocation() {
        return this.location;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
