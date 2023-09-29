public class ProgrammingLanguage {
    // Fields or attributes
    private String name;
    private int yearCreated;
    private String creator;

    // Constructor
    public ProgrammingLanguage(String name, int yearCreated, String creator) {
        this.name = name;
        this.yearCreated = yearCreated;
        this.creator = creator;
    }

    // Getter methods with protected access
    protected String getName() {
        return name;
    }

    protected int getYearCreated() {
        return yearCreated;
    }

    protected String getCreator() {
        return creator;
    }

    // Setter methods with private access
    private void setName(String name) {
        this.name = name;
    }

    private void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    private void setCreator(String creator) {
        this.creator = creator;
    }
}
