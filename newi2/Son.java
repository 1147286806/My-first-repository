package newi2;

public class Son extends Father{
	private String gender;
	private String classname;
	private String hight;
	
	public Son() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Son(String name, int age, String result) {
		super(name, age, result);
		// TODO Auto-generated constructor stub
	}


	public Son(String gender, String classname, String hight) {
		super();
		this.gender = gender;
		this.classname = classname;
		this.hight = hight;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getHight() {
		return hight;
	}

	public void setHight(String hight) {
		this.hight = hight;
	}

	@Override
	public String toString() {
		return "Son [gender=" + gender + ", classname=" + classname + ", hight=" + hight + ", name=" + name + ", age="
				+ age + ", result=" + result + "]";
	}	
	
}
