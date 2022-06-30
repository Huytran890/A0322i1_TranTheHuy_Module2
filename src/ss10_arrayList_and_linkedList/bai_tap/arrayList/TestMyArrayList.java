package ss10_arrayList_and_linkedList.bai_tap.arrayList;

public class TestMyArrayList {
    public static class Person {
        String name;
        int age;

        public Person() {

        }

        public Person(String name, int age) {
            setName(name);
            setAge(age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person {" +
                    "name: '" + name + '\'' +
                    ", age: " + age +
                    "}.";
        }

        public boolean equals(Object obj) {
            Person person = (Person) obj;
            return this.name.equals(((Person) obj).name) && this.age == ((Person) obj).age;
        }


        public static void main(String[] args) {
            MyArrayList<Person> myArrayList = new MyArrayList<>(2);
            myArrayList.add(new Person("Trần Thế Huy ", 19));
            myArrayList.add(new Person("Sơn tùng MTP ", 28));
            myArrayList.add(new Person("Nguyễn Hoàng Quyết ", 20));
            myArrayList.add(new Person("Noo Phước Thịnh ", 30), 2);
            myArrayList.remove(1);
//            MyArrayList<Person> myArrayList2 = myArrayList.clone();
//            int index = myArrayList2.indexOf(new Person("Noo Phước Thịnh ", 30));
//            System.out.println("Vị trí index cần tìm là: " + index);
            for (int i = 0; i < myArrayList.size(); i++) {
                System.out.println(myArrayList.get(i).toString());
            }
//            System.out.println(myArrayList.size());
//            System.out.println(myArrayList.get(2));
//            System.out.println(myArrayList.get(5));
//            System.out.println(myArrayList.contains(new Person("Trần Thế Huy ", 19)));
//            myArrayList.clear();
//            for (int i = 0; i < myArrayList.size(); i++) {
//                System.out.println(myArrayList.get(i).toString());
//            }
        }
    }
}
