package exercise.book;

import java.util.Scanner;

public class Book extends Document {
    private String author;
    private int numberPages;

    public Book() {

    }

    public Book(String id, String publisherName, int circulation, String author, int numberPages) {
        super(id, publisherName, circulation);
        this.author = author;
        this.numberPages = numberPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        if (numberPages < 0)
            this.numberPages = 0;
        else
            this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Book {" +
                "author: '" + author + '\'' +
                ", numberPages: " + numberPages +
                ", id: '" + id + '\'' +
                ", publisherName: '" + publisherName + '\'' +
                ", circulation: " + circulation +
                "}.";
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter the author for Book: ");
        author = sc.nextLine();
        System.out.println("Enter the number of pages for Book: ");
        numberPages = sc.nextInt();
        setNumberPages(numberPages);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.input();
        System.out.println(book.toString());

        Book book1 = new Book("ABC123","Bình ngô đại cáo",10,"Nguyễn Trãi",100);
        System.out.println(book1.toString());
    }

}
