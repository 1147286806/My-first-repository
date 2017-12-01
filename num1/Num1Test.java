package num1;

public class Num1Test {
	public static void main(String[] args) {
		NormalStudent student = new NormalStudent();
		student.study();
		student.showInfo();
		student.setName("zhangsan");
		student.setAge(20);
		System.out.println(student);
		
		SmokingStudent student2 = new SmokingStudent("lisi",20);
		student2.smoke();
		System.out.println(student2);
	}
}
