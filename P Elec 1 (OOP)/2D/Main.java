class Book {
    private String title;
    private String author;
    private int pageCount;

    // Constructor
    public Book(String title, String author, int pageCount) {
        
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }
     
      
    public void displayInfo() {
       System.out.println("Title: " + title+ ", Author: " +author + ", PageCount: " +pageCount+ "\n");
   }

    // Setter for title
    public void setTitle(String title) {
       this. title = title;
    }

    // Getter for title
   public  String getTitle() {
        return this.title;
   }

    // Setter for author
    public void setAuthor(String author) {
       this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return this.author ;
    }

    // Setter for pageCount
    public void  setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

 //    Getter for pageCount
    public int getPageCount() {
        return this. pageCount;
   }
} 

public class Main {
 public static void main(String[] args) {
        
        //Create three Book objects and set their attributes
       Book book1 = new Book("Safe Sky Archer", "4reuminct", 50);
     Book book2 = new Book("He's into Her", "Maxpein", 120);
        Book book3 = new Book("I Love you since 1892", "Binibining Mia", 80);

            
                    //Display information for each book
       book1.displayInfo();
        book2.displayInfo();
       book3.displayInfo();
    }
}