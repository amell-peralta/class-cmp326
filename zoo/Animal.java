package zoo;

public abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal() {
		name = "Dog";
		age = 1;
	}
	
	public abstract void eat();
}
