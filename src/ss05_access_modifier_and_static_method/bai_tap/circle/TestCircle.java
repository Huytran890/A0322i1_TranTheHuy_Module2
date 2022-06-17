package ss05_access_modifier_and_static_method.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle2 = new Circle(15, "Pink");
        // Không truy cập được phương thức get khi chuyển phương thức get từ public thành private bởi vì private chỉ cho truy cập trong class
        circle2.setRadius(25);
        circle2.setColor("Green");
        // Vẫn truy cập được phương thức set bth vì không có sự thay đổi access modifier.
    }
}
