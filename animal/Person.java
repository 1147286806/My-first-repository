package animal;

public abstract class Person extends Animal{

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public void speak() {
		System.out.println(name + "正在说话");
	}

	public void walk() {
		System.out.println(name + "正在走路");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
