public class Motorcycle {
    private String name;
    private int startingAtSeconds;
    private int powerSpeed;

    public Motorcycle(String name, int startingAtSeconds, int powerSpeed) {
        this.name = name;
        this.startingAtSeconds = startingAtSeconds;
        this.powerSpeed = powerSpeed;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for startingAtSeconds
    public int getStartingAtSeconds() {
        return startingAtSeconds;
    }

    public void setStartingAtSeconds(int startingAtSeconds) {
        this.startingAtSeconds = startingAtSeconds;
    }

    // Getter and Setter for powerSpeed
    public int getPowerSpeed() {
        return powerSpeed;
    }

    public void setPowerSpeed(int powerSpeed) {
        this.powerSpeed = powerSpeed;
    }
}
