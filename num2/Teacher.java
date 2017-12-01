package num2;

public class Teacher extends Person{
	private double salary;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}

	public Teacher(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [salary=" + salary + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
