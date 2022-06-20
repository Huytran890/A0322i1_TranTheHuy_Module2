package exercise.book;

import java.util.Scanner;

public class Document {
    protected String id;
    protected String publisherName;
    protected int circulation; // số bản phát hành

    public Document() {
        this("", "", 0);
    }

    public Document(String id, String publisherName, int circulation) {
        this.id = id;
        this.publisherName = publisherName;
        this.circulation = circulation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getCirculation() {
        return circulation;
    }

    public void setCirculation(int circulation) {
        if (circulation < 0)
            this.circulation = 0;
        else
            this.circulation = circulation;
    }

    @Override
    public String toString() {
        return "Document {" +
                "id: '" + id + '\'' +
                ", publisherName: '" + publisherName + '\'' +
                ", circulation: " + circulation +
                "}.";
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Id's document: ");
        id = sc.nextLine();
        System.out.println("Enter the name's publisher: ");
        publisherName = sc.nextLine();
        System.out.println("Enter the number of circulation: ");
        circulation = sc.nextInt();
        setCirculation(circulation);
    }

    public static void main(String[] args) {
        Document document = new Document();
        document.input();
        System.out.println(document.toString());

        Document document1 = new Document("ABC123","nguyễn ánh",100);
        System.out.println(document1.toString());
    }
}
