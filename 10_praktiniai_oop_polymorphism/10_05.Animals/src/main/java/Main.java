
public class Main {

	public static void main(String[] args) {
		// you can test how your classes work here

		Dog dog = new Dog();
		dog.bark();
		dog.eat();

		Dog fido = new Dog("Fido");
		fido.bark();

		Cat cat = new Cat();
		cat.purr();
		cat.eat();

		Cat garfield = new Cat("Garfield");
		garfield.purr();

		System.out.println();

		NoiseCapable d1 = new Dog();
		d1.makeNoise();

		NoiseCapable c1 = new Cat();
		c1.makeNoise();
		garfield.makeNoise();
		Cat c = (Cat) cat;
		c.purr();

	}

}
