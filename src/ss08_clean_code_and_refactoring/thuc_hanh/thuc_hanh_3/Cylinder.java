package ss08_clean_code_and_refactoring.thuc_hanh.thuc_hanh_3;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
}
