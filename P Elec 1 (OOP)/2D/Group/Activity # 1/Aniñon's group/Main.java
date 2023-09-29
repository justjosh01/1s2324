class Book {
    private String title;
    private String author;
    private int pageCount;

    // Constructor
    public Book() {
        this.title = "title";
        this.author = "author";
        this.pageCount = 1;
    }

    public Book(String title, String author, int pageCount) {

        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPageCount() {
        return this.pageCount;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of Book objects
        Book[] books = new Book[3];
        books[0] = new Book("Safe Sky Archer", "4reuminct", 50);
        books[1] = new Book("He's into Her", "Maxpein", 120);
        books[2] = new Book("I Love you since 1892", "Binibining Mia", 80);

        System.out.println("Book objects have been fabricated!!!\n");

        // Loop through the books and display their information
        for (int i = 0; i < books.length; i++) {

            System.out.println("***BOOK " + (i + 1) + "***");

            System.out.println("Title: " + books[i].getTitle() + " Author: " + books[i].getAuthor() + " PageCount: "
                    + books[i].getPageCount() + "\n");
        }
    }
}