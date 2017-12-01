package num1;

public class SmokingTeacher extends Teacher implements ISmoking{

	public SmokingTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmokingTeacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public void smoke() {
		System.out.println("SmokingTeacher.smoke()");
	}
}
