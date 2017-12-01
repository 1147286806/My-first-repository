package newi2;

public class Father {
	protected String name;
	protected int age;
	protected String result;
	
	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Father(String name, int age, String result) {
		super();
		this.name = name;
		this.age = age;
		this.result = result;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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
	
	public void show() {
		System.out.println(name + "正在说话");
	}
}
