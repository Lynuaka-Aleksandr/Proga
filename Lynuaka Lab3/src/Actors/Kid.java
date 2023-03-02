package Actors;

import Enums.Food;

public class Kid extends Person {
    public Kid(String name)  {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(getName() + " мало ест, когда " + person.getName() + " готовит " + Food.BOILED_COD + " или " +
                Food.VEGETABLE_SOUP + " или " + Food.HERRING_CUTLETS);
    }
}
