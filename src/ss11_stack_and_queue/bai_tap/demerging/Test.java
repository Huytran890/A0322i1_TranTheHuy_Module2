package ss11_stack_and_queue.bai_tap.demerging;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Huy", true, 2002));
        list.add(new Person("Nhi", false, 2001));
        list.add(new Person("Khang", true, 2000));
        list.add(new Person("Linh", false, 2002));
        System.out.println("List begging is: ");
        Collections.sort(list);

        for (Person x : list) {
            System.out.println(x);
        }
        Queue<Person> queueGirl = new LinkedList<>();
        Queue<Person> queueBoy = new LinkedList<>();

        for (Person x : list) {
            if (!x.isGender()) {
                queueGirl.add(x);
            } else {
                queueBoy.add(x);
            }
        }

        Queue<Person> person = new LinkedList<>();
        while (!queueGirl.isEmpty()) {
            person.add(queueGirl.poll());
        }
        while (!queueBoy.isEmpty()) {
            person.add(queueBoy.poll());
        }
        System.out.println("List after sorting is: ");
        for (Person x : person) {
            System.out.println(x);
        }
    }
}
