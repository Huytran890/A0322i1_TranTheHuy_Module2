package ss07_abstract_and_interface.thuc_hanh.animal;

import ss07_abstract_and_interface.thuc_hanh.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "The sound of chicken is: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }

}
