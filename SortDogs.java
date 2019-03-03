import java.util.Comparator;
import Dog.java;

public class SortDogs implements Comparator<Dog> {
	public int compare(Dog a, Dog b){
	    return a.getnumLegs() - b.getnumLegs();
	}
}
