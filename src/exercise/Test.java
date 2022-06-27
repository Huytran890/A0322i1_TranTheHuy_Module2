package exercise;

public class Test {
    package baitap1abstractvainterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

    public class PhoneBook extends Phone {

        ArrayList<String> PhoneList = new ArrayList();

        @Override
        void insertPhone(String name, String phone) {
            boolean timThay = false;
            for (String s : PhoneList) {
                if (s.contains(name)) {
                    timThay = true;
                    if (!s.contains(phone)) {
                        s += " : " + phone;
                    } else {
                        System.out.println("Danh bạ này đã có sẵn");
                    }
                }
            }
            if (!timThay) {
                PhoneList.add(name + "," + phone);
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
            String s = name;
            s = s.substring(0, s.indexOf(",")); //bỏ số điện thoại cũ (chỉ giữ lại tên)
            PhoneList.set(PhoneList.indexOf(s), s + "," + newPhone); //đưa sdt mới vào
            System.out.println("Updated");
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
        void sort() {
            if (PhoneList.size() == 0) System.out.println("PhoneList is empty");
            else {
                //Sắp xếp tăng dần theo tên
                Collections.sort(PhoneList, new Comparator<String>() {
                    @Override
                    public int compare(String s, String t1) {
                        return s.compareTo(t1);
                    }
                });
                System.out.println("Sort Ascending by name:");
                for (String s : PhoneList) {
                    System.out.println(s);
                }
                //Sắp xếp giảm dần theo tên
                Collections.sort(PhoneList, new Comparator<String>() {
                    @Override
                    public int compare(String s, String t1) {
                        return t1.compareTo(s);
                    }
                });
                System.out.println("Sort Descending by name:");
                for (String s : PhoneList) {
                    System.out.println(s);
                }
            }
        }
    }




    package baitap1abstractvainterface;

import java.util.Scanner;

    public class ManagePhoneBook {
        static PhoneBook pb = new PhoneBook();
        static Scanner scanner = new Scanner(System.in);
        static String name, phone;

        static void menu() {
            System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
            System.out.println("1. Insert phone");
            System.out.println("2. Remove phone");
            System.out.println("3. Update phone");
            System.out.println("4. Search phone");
            System.out.println("5. Sort");
            System.out.println("6. Exit");
        }

        public static void main(String[] args) {
            menu();
            while (true) {
                System.out.print("Please choose an option: ");
                switch (scanner.nextInt()) {
                    case 1:
                        insertPhone();
                        break;
                    case 2:
                        removePhone();
                    case 3:
                        updatePhone();
                        break;
                    case 4:
                        searchPhone();
                        break;
                    case 5:
                        sortPhone();
                        break;
                    case 6:
                        return;
                }
            }
        }

        private static void removePhone() {
            scanner.nextLine();
            System.out.print("Input name of person you want to remove: ");
            name = scanner.nextLine();
            pb.removePhone(name);
        }

        private static void searchPhone() {
            scanner.nextLine();
            System.out.print("Please input name of person you want to search the phone: ");
            name = scanner.nextLine();
            pb.searchPhone(name);
        }

        private static void updatePhone() {
            boolean searched = false;
            scanner.nextLine();
            System.out.print("Input name of person you want to update: ");
            name = scanner.nextLine();
            for (String s : pb.PhoneList) {
                if (name.equals(s.substring(0, s.indexOf(",")))) {
                    searched = true;
                    System.out.print("Input phone number you want to update: ");
                    phone = scanner.nextLine();
                    pb.updatePhone(name, phone);
                    break;
                }
            }
            if (!searched) System.out.println("Not found person with name is: " + name);
        }

        private static void sortPhone() {
            pb.sort();
        }

        private static void insertPhone() {
            scanner.nextLine();
            System.out.print("Input name: ");
            name = scanner.nextLine();
            System.out.print("Input phone: ");
            phone = scanner.nextLine();
            pb.insertPhone(name, phone);
        }
    }

}
