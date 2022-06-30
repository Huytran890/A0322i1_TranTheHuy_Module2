package ss10_arrayList_and_linkedList.bai_tap;

public class TestMyLinkedList<E> {
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

        @Override
        public boolean equals(Object obj) {
            TestMyLinkedList.Person person = (TestMyLinkedList.Person) obj;
            return this.name.equals(((TestMyLinkedList.Person) obj).name) && this.age == ((TestMyLinkedList.Person) obj).age;
        }

        public static void main(String[] args) {
            MyLinkedList<Person> list = new MyLinkedList<Person>();
            list.addFirst(new Person("Trần Thế Huy", 19));
            list.addLast(new Person("Sơn Tùng MTP", 25));
            list.addLast(new Person("Trần Thị Như Quỳnh", 20));
            list.addLast(new Person("Cường 7 núi", 27));
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
            System.out.println("List after adding");
            list.addFirst(new Person("Cường 7 núi", 27));
            list.addLast(new Person("Tăng Duy Tân", 21));
            list.add(new Person("DEFAULT!", 0), 0);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
//            System.out.println();
//            System.out.println(list.nearLast());
//            System.out.println();
//            list.exchange2firstNode();
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i).toString());
//            }
//            System.out.println();
//            list.exchange2lastNode();
//            System.out.println(list);
//            list.reverse();
//            System.out.println(list);
//            list.removeLast();
//            System.out.println(list);
//            list.removeFirst();
//            System.out.println(list);
//            list.remove(2);
//            System.out.println(list);
//            System.out.println(list.get(0));
//            list.set(new Person("Test", 10), 0);
//            System.out.println(list);
//            list.removeElement(new Person("Trần Thế Huy", 19));
//            System.out.println(list);
//            list.removeDuplicates();
//            System.out.println(list);
        }
    }
}