package zoo;

public class Zoo {
	public static void main(String[] args) {
		Horse horse1 = new Horse();
		Horse horse2 = new Horse("Tom", 28);
		Dog myDog = new Dog("Fido", 5);
		Dog yourDog = new Dog("Bobby", 8);
		Bird bird1 = new Bird();
		Bird bird2 = new Bird();
		
		bird1.setName("Mary");
		bird1.setAge(2);
		
		bird2.setName("John");
		bird2.setAge(7);
		
		horse1.eat();
		horse2.eat();
		myDog.eat();
		yourDog.eat();
		bird1.eat();
		bird2.eat();
		System.out.println();
		bird1.display();
		bird2.display();
		
		Animal[] animals = new Animal[20];
		animals[0] = new Horse("Peter", 8);
		animals[1] = new Dog("Mario", 12);
		animals[2] = new Cow();
		for (int i = 3; i < animals.length; ++i) {
			animals[i] = new Bird();
		}
		for (Animal animal : animals) {
			animal.eat();
		}
	} 
}
