package case_study.models;

public class Room extends Facility {
    private int numberOfBed;
    private String typeOfBed;
    private String complimentary;

    public Room() {

    }

    public Room(String id, String facilityName, double rentalFee, double rentalDate, String rentalType, int maximumPeople, double areaTotal, int numberOfBed, String typeOfBed, String complimentary) {
        super(id, facilityName, rentalFee, rentalDate, rentalType, maximumPeople, areaTotal);
        setNumberOfBed(numberOfBed);
        setTypeOfBed(typeOfBed);
        setComplimentary(complimentary);
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public String getTypeOfBed() {
        return typeOfBed;
    }

    public void setTypeOfBed(String typeOfBed) {
        this.typeOfBed = typeOfBed;
    }

    public String getComplimentary() {
        return complimentary;
    }

    public void setComplimentary(String complimentary) {
        this.complimentary = complimentary;
    }

    @Override
    public void showInformation() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "The rental information: {" +
                "numberOfBed: " + numberOfBed +
                ", typeOfBed: '" + typeOfBed + '\'' +
                ", complimentary: '" + complimentary + '\'' +
                "}.";
    }
}
