package Actors;

public class Dad extends Person {
    public Dad(String name)  {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(getName() + " пришел обедать и слушал что ему рассказывает " + person.getName());
    }
}
