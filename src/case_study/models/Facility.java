package case_study.models;

public abstract class Facility {
    private String id;
    private String facilityName; // ten loai muon thue
    private double rentalFee;
    private double rentalDate;
    private final String[] rentalTypeArray = {"Superior", "Deluxe", "Suite", "Executive", "premier"}; // phòng tiêu chuẩn, phòng tầm trung, phòng cao cấp, phòng thương gia, phòng chủ tịch.
    private String rentalType;
    private int maximumPeople;
    private double areaTotal;


    public Facility() {

    }

    public Facility(String id, String facilityName, double rentalFee, double rentalDate, String rentalType, int maximumPeople, double areaTotal) {
        setId(id);
        setFacilityName(facilityName);
        setRentalFee(rentalFee);
        setRentalDate(rentalDate);
        setRentalType(rentalTypeArray[Integer.parseInt(rentalType)]);
        setMaximumPeople(maximumPeople);
        setAreaTotal(areaTotal);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public double getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(double rentalDate) {
        this.rentalDate = rentalDate;
    }

    public String[] getRentalTypeArray() {
        return rentalTypeArray;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalTypeArray[Integer.parseInt(rentalType)];
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public abstract void showInformation();

    @Override
    public String toString() {
        return "id: '" + id + '\'' +
                ", facilityName: '" + facilityName + '\'' +
                ", rentalFee: " + rentalFee +
                ", rentalDate: " + rentalDate +
                ", rentalType: '" + rentalType + '\'' +
                ", maximumPeople: " + maximumPeople +
                ", areaTotal: " + areaTotal;
    }
}
