package exercise.book;

public class Newspaper extends Document{
    private Date date;

    public Newspaper(){
        this.date = new Date();
    }

    public Newspaper(String id, String publisherName, int circulation, Date date) {
        super(id, publisherName, circulation);
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Newspaper {" +
                "date: " + date +
                ", id: '" + id + '\'' +
                ", publisherName: '" + publisherName + '\'' +
                ", circulation: " + circulation +
                "}.";
    }

    public static void main(String[] args) {
//        Newspaper newspaper = new Newspaper();
//        newspaper.input();
//        System.out.println(newspaper.toString());

        Date date = new Date(16,9,2022);
        Newspaper newspaper1 = new Newspaper("BCD234","Truyện Kiều",10,date);
        System.out.println(newspaper1.toString());
    }
}
