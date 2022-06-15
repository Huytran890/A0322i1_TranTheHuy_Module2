package ss05_access_modifier_and_static_method.bai_tap;

public class TestStudent {
    public static void main(String[] args) {
        Student student2 = new Student("Khang","A10122");
        // không thể truy cập đến phương thức set vì tính bao đóng.
        // vãn truy cập được phương thức get bth.
        student2.getClasses();
        student2.getName();
    }
}
