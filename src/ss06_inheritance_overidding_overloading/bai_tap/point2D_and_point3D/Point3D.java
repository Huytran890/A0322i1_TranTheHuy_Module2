package ss06_inheritance_overidding_overloading.bai_tap.point2D_and_point3D;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        super();
        this.z = 1;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(float x, float y, float z) {
        super.x = x;
        super.y = y;
        this.z = z;
        float[] arr = new float[]{super.x, super.y, this.z};
        return arr;
    }

    public String toString() {
        return "The Point 3D is: " + "(" + getX() + "," + getY() + "," + getZ() + ")";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(10.0f,7.0f,9.0f);
        System.out.println(point3D);
    }
}
