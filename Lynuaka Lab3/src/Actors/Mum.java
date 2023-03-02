package Actors;

import Enums.Food;

public class Mum extends Person {
    public Mum(String name)  {
        super(name);
    }

    @Override
    public void action(Person person) {
        System.out.println(getName() + " поняла, что " + person.getName() + " что-то натворил");
    }

    public void funAtLunch(Person person) {
        System.out.println(getName() + " считает, что за обедом должно быть весело, " + person.getName() + " поддерживает ее в этом");
    }

    public void tastyFood() {
        System.out.println(getName() + " подала к обеду " + Food.VEAL_CHOPS + " и " + Food.STRAWBERRY);
    }

    public void transformation() {
        System.out.println(getName() + " превращает маленький обед в большой пир");
    }
}
