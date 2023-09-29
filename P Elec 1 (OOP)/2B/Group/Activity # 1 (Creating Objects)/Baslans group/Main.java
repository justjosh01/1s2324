public class Main {
    public static void main(String[] args) {
        // Create instances of ProgrammingLanguage
        ProgrammingLanguage java = new ProgrammingLanguage("Java", 1995, "James Gosling");
        ProgrammingLanguage python = new ProgrammingLanguage("Python", 1991, "Guido van Rossum");
        ProgrammingLanguage c = new ProgrammingLanguage("C", 1970, "Dennis M. Ritchie");

        // Display information about programming languages
        System.out.println("Programming Language Information:");
        System.out.println("Name: " + java.getName());
        System.out.println("Year Created: " + java.getYearCreated());
        System.out.println("Creator: " + java.getCreator());
        System.out.println();

        System.out.println("Name: " + python.getName());
        System.out.println("Year Created: " + python.getYearCreated());
        System.out.println("Creator: " + python.getCreator());
        System.out.println();

        System.out.println("Name: " + c.getName());
        System.out.println("Year Created: " + c.getYearCreated());
        System.out.println("Creator: " + c.getCreator());
    }
}
