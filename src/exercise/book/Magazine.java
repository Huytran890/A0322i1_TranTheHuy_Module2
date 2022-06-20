package exercise.book;

import java.util.Scanner;

public class Magazine extends Document {
    private Date date;

    public Magazine() {
        this.date = new Date();
    }

    public Magazine(String id, String publisherName, int circulation, Date date) {
        super(id, publisherName, circulation);
        setDate(date);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Magazine {" +
                "date: " + date +
                ", id: '" + id + '\'' +
                ", publisherName: '" + publisherName + '\'' +
                ", circulation: " + circulation +
                "}.";
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the publication date");
        date.input();
    }

    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        magazine.input();
        System.out.println(magazine.toString());

//        Date date = new Date(19, 6, 2022);
//        Magazine magazine1 = new Magazine("ABC123", "Bình Ngô Đại Cáo", 10, date);
//        System.out.println(magazine1.toString());
    }
}
