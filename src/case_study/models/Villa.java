package case_study.models;

public class Villa extends Facility {
    private int numberOfFloor;
    private int numberOfRoom;
    private int numberOfBed;
    private String typeOfBed;
    private String complimentaryUtilities; // miễn phí tiện ích.

    public Villa() {

    }

    public Villa(String id, String facilityName, double rentalFee, double rentalDate, String rentalType, int maximumPeople, double areaTotal, int numberOfFloor, int numberOfRoom, int numberOfBed, String typeOfBed, String complimentaryUtilities) {
        super(id, facilityName, rentalFee, rentalDate, rentalType, maximumPeople, areaTotal);
        setNumberOfFloor(numberOfFloor);
        setNumberOfRoom(numberOfRoom);
        setNumberOfBed(numberOfBed);
        setTypeOfBed(typeOfBed);
        setComplimentaryUtilities(complimentaryUtilities);
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
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

    public String getComplimentaryUtilities() {
        return complimentaryUtilities;
    }

    public void setComplimentaryUtilities(String complimentaryUtilities) {
        this.complimentaryUtilities = complimentaryUtilities;
    }

    @Override
    public void showInformation() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "The rental information: {" + super.toString() +
                "\nnumberOfFloor: " + numberOfFloor +
                ", numberOfRoom: " + numberOfRoom +
                ", numberOfBed: " + numberOfBed +
                ", typeOfBed: '" + typeOfBed + '\'' +
                ", complimentaryUtilities: '" + complimentaryUtilities + '\'' +
                "}.";
    }

    public static void main(String[] args) {
        Villa villa = new Villa("A03", "villa", 5000000, 2, "luxury", 4, 60, 2, 5, 3, "single bed", "message, breakfast and transportation fee");
        villa.showInformation();
    }

}
