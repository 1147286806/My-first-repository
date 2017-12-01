package num1;

public class SmokingStudent extends Student implements ISmoking{

	public SmokingStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmokingStudent(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public void smoke() {
		System.out.println("SmokingStudent.smoke()");
	}
}
