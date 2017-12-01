package num2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Num2Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student1 = new Student("张三", 20, "男");
		Student student2 = new Student("李四", 21, "女");
		Student student3 = new Student("王五", 22, "男");
		Student student4 = new Student("赵六", 23, "男");
		Student student5 = new Student("小七", 24, "女");
		ArrayList<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		int size = list.size();
		while (true) {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
			System.out.println("0");
			int num = scanner.nextInt();
			if (num == 0) {
				System.out.println("退出系统");
				break;
			}
			switch (num) {
			case 1:
				System.out.println("请输入学生姓名");
				String namesearch = scanner.next();
				boolean isNameSearchFound = false;
				for (int i = 0; i < size; i++) {
					Student studentsearch = (Student) list.get(i);
					String name = studentsearch.name;
					if (namesearch.equals(name)) {
						System.out.println(studentsearch);
						isNameSearchFound = true;
					}
				}
				if (isNameSearchFound == false) {
					System.out.println("查无此人");
				}
				break;
			case 2:
				System.out.println("请输入学生年龄");
				int agesearch = scanner.nextInt();
				boolean isAgeSearchFound = false;
				for (int i = 0; i < size; i++) {
					Student studentsearch = (Student) list.get(i);
					int age = studentsearch.age;
					if (agesearch == age) {
						System.out.println(studentsearch);
						isAgeSearchFound = true;
					}
				}
				if (isAgeSearchFound == false) {
					System.out.println("查无此人");
				}
				break;
			case 3:
				System.out.println("请输入学生性别");
				String gendersearch = scanner.next();
				boolean isGenderSearchFound = false;
				for (int i = 0; i < size; i++) {
					Student studentsearch = (Student) list.get(i);
					String gender = studentsearch.gender;
					if (gendersearch.equals(gender)) {
						System.out.println(studentsearch);
						isGenderSearchFound = true;
					}
				}
				if (isGenderSearchFound == false) {
					System.out.println("查无此人");
				}
				break;
			case 4:
				System.out.println("输入数字");
				int i = scanner.nextInt();
				Student student = list.get(i);
				System.out.println(student.name);
				list.remove(student);
				size --;
				break;
			default:
				break;
			}
		}
	}
}
