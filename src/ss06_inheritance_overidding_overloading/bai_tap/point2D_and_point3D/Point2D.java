package ss06_inheritance_overidding_overloading.bai_tap.point2D_and_point3D;

public class Point2D {
    protected float x;
    protected float y;

    public Point2D() {
        this(1, 1);
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(float x, float y) {
        this.x = x;
        this.y = y;
        float[] arr = new float[]{this.x, this.y};
        return arr;
    }

    public void setXY(float newX, float newY) {
        this.x = newX;
        this.y = newY;
    }

    public String toString() {
        return "The Point 2D is: " + "(" + getX() + "," + getY() + ")";
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(4, 6);
        System.out.println(point2D);
    }
}
