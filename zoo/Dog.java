package zoo;

public class Dog extends Animal {
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override 
	public void eat() {
		System.out.println(name + " is eating meat...");
	}
}
