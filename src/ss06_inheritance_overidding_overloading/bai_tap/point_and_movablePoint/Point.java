package ss06_inheritance_overidding_overloading.bai_tap.point_and_movablePoint;

public class Point {
    protected float x;
    protected float y;

    public Point(){
        this(1.0f,1.0f);
    }

    public Point(float x, float y) {
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
        return "The array of point  is: " + "[" + getX() + "," + getY() + "].";
    }
}
