package newi2;

import org.junit.Test;

public class anydlm {
	@Test
	public void show() {
		Son student = new Son();
		student.setName("zhangsan");
		System.out.println(student);
		student.show();
	}
}
