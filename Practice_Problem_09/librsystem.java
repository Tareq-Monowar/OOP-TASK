package Practice_Problem_09;

class Book {
    private String title;
    private String author;


    public Book(String title) {
        this.title = title;
        this.author = null;
    }


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + (author != null ? author : "Not specified"));
    }
}


public class librsystem {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist");
        Book book2 = new Book("1984", "George Orwell");

        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
    }
}
