package Actors;


import Enums.Place;
import Impl.Movementable;

public abstract class Person implements Movementable {
    private String name;
    public Person () {}
    public Person (String name) {
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return name;
    }

public static void talking(Place place, Person... personArr) {
    System.out.print("Когда ");
        for (int i = 0; i < personArr.length; i++) {
            System.out.print(personArr[i] + ", ");
        }
    System.out.println("собираются вместе " + place + ", то всем весело");
}

  /* public void emotion(EmotionalCondition emotionalCondition) {

        if (emotionalCondition != EmotionalCondition.CALM)
            System.out.println("У героя " + getName() + " появляется эмоция: " + emotionalCondition);    else
            System.out.println(getName()+ emotionalCondition);
    }*/


}
