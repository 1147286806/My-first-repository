package newi;

public class ClassApply {
	private String name;
	private int age;
	private String classname;
	private String gender;
	
	public ClassApply() {
	}
	public ClassApply(String name, int age, String classname, String gender) {
		this.name = name;
		this.age = age;
		this.classname = classname;
		this.gender = gender;
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
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "学生信息 [名字=" + name + ", 年龄=" + age + ", 班级=" + classname + ", 性别=" + gender + "]";
	}
	
	
}
