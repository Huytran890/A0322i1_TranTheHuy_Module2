package ss11_stack_and_queue.thuc_hanh.thuc_hanh_1;

import static ss11_stack_and_queue.thuc_hanh.thuc_hanh_1.MyGenericStack.stackOfIStrings;
import static ss11_stack_and_queue.thuc_hanh.thuc_hanh_1.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
