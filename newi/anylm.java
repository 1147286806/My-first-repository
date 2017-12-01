package newi;

import java.awt.Event;
import java.util.Scanner;

import org.junit.Test;

public class anylm {
	
	@Test
	public void test1() {
		int sum =0;
		for(int i=1; i<=100; i++){
			sum = sum + i;
		}
		System.out.println("sum：" + sum);
	}
	
	@Test
	public void test2() {
		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1, 0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
		int[] time = new int[ics(score)];
		for (int i = 0; i < score.length; i++) {
			time[score[i]]++;
		}
		for (int i = 0; i < time.length; i++) {
			if (time[i] != 0) {
				System.out.println(i + "出现了" + time[i] + "次");
			}
		}
	}

	public static int ics(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max + 1;
	}
	
	@Test
	public void Test6(){
		int[] score = { 1, 1, 1, 4, 3, 3, 5 };
		int[] deg = new int[judgeTime(score)];
		for (int i = 0; i < score.length; i++) {
			deg[score[i]]++;
		}
		for (int i = 0; i < deg.length; i++) {
			if (deg[i] != 0) {
				System.out.println(i + "的次数是" + deg[i]);
			}
		}
	}
	
	public static int judgeTime(int[] array) {
		int max = 0;
		for(int i = 0;i<array.length;i++){
			if(array[i] > max){
				max = array[i];
			}
		}
		return max+1;
	}
	
	@Test
	public void test3() {
		for (int i = 1; i <= 6; i++) {
			for (int k = 1; k <= 6 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ((2 * i) - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Test
	public void test4(){
		int even = 0;
		int odd = 0;
		int[] array = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1, 0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("偶数是：" + even + "奇数是：" + odd);
	}
	
	@Test
	public void test5(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int num = scanner.nextInt();
		double[] array = new double[num];
		double max = 0;
		double ave;
		System.out.println("请输入学生成绩：");
		for (int i = 0; i < array.length; i++) {
			array[i] =scanner.nextDouble();
		}
		for (int j = 0; j < array.length; j++) {
			max += array[j];
		}
		ave = max / array.length;
		System.out.println("平均数是：" + ave);
	}
	
	@Test
	public void test6(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生数量：");
		int coun = scanner.nextInt();
		ClassApply[] classapplys = new ClassApply[coun];
		
		inputStudents(classapplys);
		
		showStudents(classapplys);
		
		searchByCondition(classapplys);
	}

	private void searchByCondition( ClassApply[] classapplys) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("根据姓名查询：1");
			System.out.println("根据年龄查询：2");
			System.out.println("根据性别查询：3");
			System.out.println("根据班级查询：4");
			System.out.println("退出系统：0");
			int num = scanner.nextInt();

			if (num == 0) {
				System.out.println("退出系统！");
				break;
			}
			
			switch(num){
			case 1:
				searchByName(classapplys);
				break;
			case 2:
				searchByAge(classapplys);
				break;
			case 3:
				searchByGender( classapplys);
				break;
			case 4:
				searchByClassName(classapplys);
				break;
			default:
				System.out.println("输入不正确！");
				break;
			}
		}
	}

	private void searchByClassName(ClassApply[] classapplys) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生班级");
		String classNameSearch = scanner.next();
		boolean isSearchByClassName = false;
		for(int i = 0;i<classapplys.length; i++){
			ClassApply student = classapplys[i];
			String className = student.getClassname();
			if(classNameSearch.equals(className)){
				System.out.println(student);
				isSearchByClassName = true;
			}
		}
		if (isSearchByClassName == false) {
			System.out.println("查无此人！");
		}
	}

	private void searchByGender( ClassApply[] classapplys) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生性别！");
		String genderSearch = scanner.next();
		boolean isGenderSearchFound = false;
		for(int i = 0; i<classapplys.length; i++){
			ClassApply student = classapplys[i];
			String gender = student.getGender();
			if(genderSearch.equals(gender)){
				System.out.println(student);
				isGenderSearchFound = true;
			}
		}
		if (isGenderSearchFound == false) {
			System.out.println("查无此人！");
		}
	}

	private void searchByAge( ClassApply[] classapplys) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生年龄：");
		int ageSearch = scanner.nextInt();
		boolean isAgeSearchFound = false;
		for(int i = 0; i<classapplys.length; i++){
			ClassApply student = classapplys[i];
			int age = student.getAge();
			if(ageSearch == age){
				System.out.println(student);
				isAgeSearchFound = true;
			}
		}
		if(isAgeSearchFound == false){
			System.out.println("查无此人！");
		}
	}

	private void searchByName( ClassApply[] classapplys) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生姓名！");
		String nameSearch = scanner.next();
		boolean isNameSearchFound = false;
		for (int i = 0; i < classapplys.length; i++) {
			ClassApply student = classapplys[i];
			String name = student.getName();
			if (nameSearch.equals(name)) {
				System.out.println(student);
				isNameSearchFound = true;
			}
		}
		if (isNameSearchFound == false) {
			System.out.println("查无此人！");
		}
	}

	private void showStudents(ClassApply[] classapplys) {
		for (int i = 0; i < classapplys.length; i++) {
			ClassApply classapply = classapplys[i];
			System.out.println(classapply.toString());
		}
	}

	private void inputStudents( ClassApply[] classapplys) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < classapplys.length; i++) {
			System.out.println("请输入姓名：");
			String name = scanner.next();
			System.out.println("请输入年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入性别：");
			String gender = scanner.next();
			System.out.println("请输入班级：");
			String classname = scanner.next();
			ClassApply classapply = new ClassApply(name, age, classname, gender);
			classapplys[i] = classapply;
		}
	}
}
