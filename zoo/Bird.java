package zoo;

public class Bird extends Animal {
	public Bird() {
		name = "Archimedes";
		age = 2;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	@Override
	public void eat() {
		System.out.println("I'm eating seeds...");
	}
}
