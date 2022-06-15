package ss05_access_modifier_and_static_method.bai_tap;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 0;
        this.color = "Red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        if (radius <= 0)
            this.radius = 1.0;
        else
            this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10, "Blue");
        System.out.println("The circle which has the radius: " + circle1.getRadius() + " and the color: " + circle1.getColor());
        circle1.setRadius(20);
        circle1.setColor("Orange");
        System.out.println("The circle after changing which has the radius: " + circle1.getRadius() + " and the color: " + circle1.getColor());
    }
}
