import java.util.*;

public class Dog {
	
	public String name;
	public int numLegs;
	
	public String toString() {
		return "Name: " + getName() + " Legs: " + getnumLegs();
	}
	public Dog(String str, int num) {
		name = str;
		numLegs = num;
	}
	
	public String getName() {
		return name;
	}
	public int getnumLegs() {
		return numLegs;
	}
}

