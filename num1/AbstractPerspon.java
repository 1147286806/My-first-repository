package num1;

public abstract class AbstractPerspon {
	protected String name;
	protected int age;
	public AbstractPerspon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AbstractPerspon(String name, int age) {
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
	
	public void showInfo() {
		System.out.println("AbstractPerspon.showInfo()");
	}
	@Override
	public String toString() {
		return "AbstractPerspon [name=" + name + ", age=" + age + "]";
	}
	
	
}
