class Book {
    private String title;
    private String author;
    private String bsbn;
      
     // Parameterized constructor
    public Book(String title, String author,      String bsbn) {
        this.title = title;
        this.author = author;
        this.bsbn = bsbn;
    }
    public Book() { 
    }     
      //getter and setter methods
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getbsbn() {
        return bsbn;
    }
    public void setbsbn(String bsbn) {
        this.bsbn = bsbn;
    }
}
public class Main {
    public static void main(String[] args) {
   //Create Book objects using the    parameterized constructor
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.setTitle("Javah");
        book1.setAuthor("Nino");
        book1.setbsbn("099");

        book2.setTitle("Pythone");
        book2.setAuthor("Jessie");
        book2.setbsbn("091");

        book3.setTitle("Pph");
        book3.setAuthor("Ronmar");
        book3.setbsbn("009");

        
        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Bsbn: " + book1.getbsbn());

        System.out.println("\nBook 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Bsbn: " + book2.getbsbn());

        System.out.println("\nBook 3:");
        System.out.println("Title: " + book3.getTitle());
        System.out.println("Author: " + book3.getAuthor());
        System.out.println("Bsbn: " + book3.getbsbn());
    }
}