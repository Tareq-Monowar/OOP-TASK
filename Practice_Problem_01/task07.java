package Practice_Problem_01;

public class task07 {
    String title;
    String author;

    task07(String title) {
        this.title = title;
    }

    task07(String title, String author) {
        this(title);
        this.author = author;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + (author != null ? author : "Not specified"));
    }

    public static void main(String[] args) {
        task07 book1 = new task07("Ultapalta");
        task07 book2 = new task07("Tin goyenda", "Rakib hasan");

        book1.displayBook();
        System.out.println();
        book2.displayBook();
    }
}
