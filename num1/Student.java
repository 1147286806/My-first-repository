package num1;

public abstract class Student extends AbstractPerspon{

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public void study() {
		System.out.println("Student.study()");
	}
	
	public void showInfo() {
		System.out.println("Student.showInfo()");
	}
}
