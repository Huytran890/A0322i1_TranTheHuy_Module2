package ss06_inheritance_overidding_overloading.bai_tap.cylinder_and_circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0)
            this.height = 1.0;
        else
            this.height = height;
    }

    @Override
    public String toString() {
        return "The radius of cylinder is:  " + getRadius()
                + " and the color of cylinder is " + getColor() + "\n"
                + "The area around of the cylinder is: " + AreaAroundTheCylinder() + "\n"
                + "The total area of the cylinder is: " + TotalAreaOfCylinder() + "\n"
                + "The volume of the cylinder is: " + AreaAroundTheCylinder();
    }


    public double AreaAroundTheCylinder() {
        double s1 = 2 * PI * super.getRadius() * this.height;
        return s1;
    }

    public double TotalAreaOfCylinder() {
        double s2 = this.AreaAroundTheCylinder() + 2 * PI * Math.pow(super.getRadius(), 2);
        return s2;
    }

    public double VolumeOfCylinder() {
        double v = PI * Math.pow(super.getRadius(), 2) * this.height;
        return v;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, "blue", 6);
        System.out.println(cylinder);
    }

}
