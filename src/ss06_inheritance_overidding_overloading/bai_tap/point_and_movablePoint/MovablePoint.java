package ss06_inheritance_overidding_overloading.bai_tap.point_and_movablePoint;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        super();
        this.xSpeed = 1.0f;
        this.ySpeed = 1.0f;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        float[] arr = new float[]{this.xSpeed, this.ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "the movement is: " + "[" + getX() + "," + getY() + "]" + " and speed is: " + "[" + getXSpeed() + "," + getYSpeed() + "].";
    }

    public Point move() {
        super.x += this.getXSpeed();
        super.y += this.getYSpeed();
        return this;
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(2.0f, 2.0f);
        System.out.println(point);

        MovablePoint moveAblePoint = new MovablePoint();
        System.out.println(moveAblePoint);

        moveAblePoint = new MovablePoint(2.0f, 2.0f, 4.0f, 4.0f);
        System.out.println(moveAblePoint);

        System.out.println(moveAblePoint.move());
    }
}
