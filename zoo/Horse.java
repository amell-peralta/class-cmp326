package zoo;

public class Horse extends Animal {
	public Horse() {
		this("Jerry", 12);
	}
	
	public Horse(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override 
	public void eat() {
		System.out.println(getName() + " is eating grass...");
	}
}
