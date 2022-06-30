package exercise.manage_phoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    ArrayList<String> PhoneList = new ArrayList();


    @Override
    void insertPhone(String name, String phone) {
        boolean check = false;
        for (String s : PhoneList) {
            if (s.contains(name)) {
                check = true;
                if (!s.contains(phone)) {
                    s += " : " + phone;
                } else {
                    System.out.println("The phone book already exist!!!");
                }
            }
        }
        if (!check) {
            PhoneList.add(name + "," + phone);
        }
    }

    @Override
    void showPhone() {
        for (int i = 0; i < PhoneList.size(); i++) {
            System.out.println(PhoneList.get(i).toString());
        }
    }

    @Override
    void removePhone(String name) {
        boolean searched = false;
        for (String s : PhoneList) {
            if (name.equals(s.substring(0, s.indexOf(",")))) {
                searched = true;
                PhoneList.remove(s);
                System.out.println("Removed");
                break;
            }
        }
        if (!searched) System.out.println("Not found person with name: " + name);
    }

    @Override
    void updatePhone(String name, String newPhone) {
        for (String s : PhoneList) {
            if (name.equals(s.substring(0, s.indexOf(",")))) {
                PhoneList.set(PhoneList.indexOf(s), name + "," + newPhone);
                System.out.println("Updated");
                break;
            }
        }
    }

    @Override
    void searchPhone(String name) {
        boolean searched = false;
        for (String s : PhoneList) {
            if (s.contains(name)) {
                searched = true;
                System.out.println(s.toString());
                break;
            }
        }
        if (!searched) System.out.println("Not found person");
    }


    @Override
    void sortPhone() {
        if (PhoneList.size() == 0) System.out.println("PhoneList is empty");
        else {
            Collections.sort(PhoneList, new Comparator<String>() {
                @Override
                public int compare(String s, String t1) {
                    int temp = s.compareTo(t1);
                    if (temp >= 0)
                        return 1;
                    return -1;
                }
            });
            System.out.println("Sort Ascending by name:");
            for (String s : PhoneList) {
                System.out.println(s);
            }
        }
    }
}





