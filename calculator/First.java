package calculator;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

import org.junit.Test;

public class First {
	@Test
	public void show() {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("根据提示选择运算方法：" + "\n" + "加法请按——1" + "\n" + "减法请按——2" + "\n" + "乘法请按——3" + "\n" + "除法请按——4"
					+ "\n" + "退出请按——0");
			int num = scanner.nextInt();
			int num1;
			int num2;
			int result;
			if (num == 0) {
				System.out.println("退出系统！");
				break;
			}
			switch (num) {
			case 1:
				result = additiveOperation();
				break;

			case 2:
				result = subtrationOperation();
				break;

			case 3:
				result = multiplyOperation();
				break;

			case 4:
				System.out.println("请输入第一个数字：");
				num1 = scanner.nextInt();
				System.out.println("请输入第二个数字：");
				num2 = scanner.nextInt();
				if(num2 == 0){
					System.out.println("除数不能为0!");
					continue;
				}
				Addition div = new Addition(num1, num2);
				result = div.divResult();
				System.out.println(result);
				break;

			default:
				System.out.println("数字输入错误！");
				break;
			}
		}
		
	}

	private int multiplyOperation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个数字：");
		int num2 = scanner.nextInt();
		Addition mul = new Addition(num1, num2);
		int result = mul.mulResult();
		System.out.println(result);
		return result;
	}

	private int subtrationOperation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个数字：");
		int num2 = scanner.nextInt();
		Addition sub = new Addition(num1, num2);
		int result = sub.subResult();
		System.out.println(result);
		return result;
	}

	private int additiveOperation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个数字：");
		int num2 = scanner.nextInt();
		Addition add = new Addition(num1, num2);
		int result = add.addResult();
		System.out.println(result);
		return result;
	}
}
