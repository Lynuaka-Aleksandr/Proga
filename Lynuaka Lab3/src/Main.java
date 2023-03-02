import Actors.*;
import Enums.Place;

public class Main {

    public static void main(String[] args) {
	Mum mum = new Mum("мама");
	Dad dad = new Dad("папа");
	Kid kid = new Kid("Малыш");
	Betan betan = new Betan("Бетан");
	Bosse bosse = new Bosse("Боссе");

	mum.action(kid);
	dad.action(mum);
    mum.funAtLunch(kid);
    Person.talking(Place.TABLE ,kid, mum, dad, bosse, betan);
    kid.action(mum);
    mum.tastyFood();
    bosse.holidayTrip(Place.YACHT_CLUB);
    bosse.action(mum);
    betan.holidayTrip(Place.PEASANT_FARM);
    betan.action(dad);
    mum.transformation();
    }
}
