package num1;

public class SmokingBikingTeacher extends Teacher implements ISmoking,IBiking{

	public SmokingBikingTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmokingBikingTeacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public void smoke() {
		System.out.println("SmokingBikingTeacher.smoke()");
	}
	
	public void bike() {
		System.out.println("SmokingBikingTeacher.bike()");
	}
}
