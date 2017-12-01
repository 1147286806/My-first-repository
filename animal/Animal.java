package animal;

public abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	public void speak() {
		// TODO Auto-generated method stub
		
	}
	public void walk() {
		// TODO Auto-generated method stub
	}
	
	
	
}
