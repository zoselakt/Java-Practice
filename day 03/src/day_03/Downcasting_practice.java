package day_03;

public class Downcasting_practice {
	public static void main(String[] args) {
		Animal Lion1 = new Lion();
		Lion l = new Lion();
		int i=2;
		Zookeeper james = new Zookeeper();
		james.feed(Lion1);
		james.feed(l);
	}
}

class Animal{
	void breath() {System.out.println("¼û½¬±â");}
}
class Lion extends Animal{
	public String toString() {
		return "»çÀÚ";
	}
}
class Rabbit extends Animal {
	public String toString() {
		return "Åä³¢";
	}
}
class Monkey extends Animal{
	public String toString() {
		return "¿ø¼şÀÌ";
	}
}
class Zookeeper{
	void feed(Animal animal) {
		System.out.println(animal + "¿¡°Ô ¸ÔÀÌÁÖ±â");
	}
}