package exercise.manageStudent;

import java.util.Scanner;


public class Professor extends Person {
    private int rank;
    private String rankDescription;

    public Professor() {
        super();
        this.setRank(0);
    }

    public Professor(String name, String phoneNumber, DateOfBirth dateOfBirth, Address address, int rank, String rankDescription) {
        super(name, phoneNumber, dateOfBirth, address);
        this.rank = rank;
        setRankDescription(rank);
    }

    public void setRank(int rank) {
        if (rank >= 1 && rank <= 6)
            this.rank = rank;
        else
            this.rank = 6;
    }

    public int getRank() {
        return rank;
    }

    public String getRankDescription() {
        return rankDescription;
    }

    public void setRankDescription(int rank) {
        switch (rank) {
            case 1:
                this.rankDescription = "Assistant Professor";
                break;
            case 2:
                this.rankDescription = "Associate Professor";
                break;
            case 3:
                this.rankDescription = "Professor";
                break;
            case 4:
                this.rankDescription = "Assistant Teaching Professor";
                break;
            case 5:
                this.rankDescription = "Associate Teaching Professor";
                break;
            case 6:
                this.rankDescription = "Teaching Professor";
                break;
            default:
                this.rankDescription = "None";
                break;
        }
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rank from 1 to 6: ");
        rank = sc.nextInt();
        setRank(rank);
        switch (rank) {
            case 1:
                this.rankDescription = "Assistant Professor";
                break;
            case 2:
                this.rankDescription = "Associate Professor";
                break;
            case 3:
                this.rankDescription = "Professor";
                break;
            case 4:
                this.rankDescription = "Assistant Teaching Professor";
                break;
            case 5:
                this.rankDescription = "Associate Teaching Professor";
                break;
            case 6:
                this.rankDescription = "Teaching Professor";
                break;
            default:
                this.rankDescription = "None";
                break;
        }
        setRankDescription(rank);
    }

    @Override
    public String toString() {
        return "Professor {" +
                "rank: " + getRank() +
                ", rankDescription: '" + getRankDescription() + '\'' +
                ", name: '" + name + '\'' +
                ", phoneNumber: '" + phoneNumber + '\'' +
                ", dateOfBirth: " + dateOfBirth +
                ", address: " + address +
                "}.";
    }

    public static void main(String[] args) {
        Professor pro = new Professor();
        pro.input();
        System.out.println(pro.toString());
    }

}



