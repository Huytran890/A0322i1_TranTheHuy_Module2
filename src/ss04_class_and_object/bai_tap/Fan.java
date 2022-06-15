package ss04_class_and_object.bai_tap;

public class Fan {
    private int SLOW, MEDIUM, FAST;
    private int speed;
    private boolean status;
    private double radius;
    private String color;

    public Fan() {
        this.SLOW = 1;
        this.MEDIUM = 2;
        this.FAST = 3;
        this.speed = SLOW;
        this.status = false; // tắt
        this.radius = 5.0;
        this.color = "blue";
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStatus() {
        return status;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        if (status)
            return "Fan is off which is " + this.getColor() + ", radius " + this.getRadius() + " and the speed is " + this.getSpeed();
        else
            return "Fan is on which is " + this.getColor() + ", radius " + this.getRadius() + " and the speed is " + this.getSpeed();
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(10,true,20,"red");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(15,false,20,"orange");
        System.out.println(fan2.toString());
    }

}
