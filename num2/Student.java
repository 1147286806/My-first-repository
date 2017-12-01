package num2;

public class Student extends Person{
	private double result;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
	}

	public Student(Double result) {
		super();
		this.result = result;
	}

	public double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [ name=" + name + ", age=" + age + ", gender=" + gender + " + result=" + result + "]";
	}
	
}
