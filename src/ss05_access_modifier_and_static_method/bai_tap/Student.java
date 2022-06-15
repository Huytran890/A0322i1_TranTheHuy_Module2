package ss05_access_modifier_and_static_method.bai_tap;

public class Student {
    private String name;
    private String classes;

    public Student() {
        this.name = "John";
        this.classes = "C02";
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        if (name == "")
            this.name = "John";
        else
            this.name = name;
    }

    public void setClasses(String classes) {
        if (classes == "")
            this.classes = "C02";
        else
            this.classes = classes;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Huy", "A0322i1");
        System.out.println("The name of student: " + student1.getName() + " and the classes: " + student1.getClasses());
        student1.setName("");
        student1.setClasses("");
        System.out.println("The name of student: " + student1.getName() + " and the classes: " + student1.getClasses());
    }
}
