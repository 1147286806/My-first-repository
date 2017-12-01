package num1;

public abstract class Teacher extends AbstractPerspon{

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public void teacher() {
		System.out.println("Teacher.teacher()");
	}
	
	public void showInfo() {
		System.out.println("Teacher.showInfo()");
	}
}
