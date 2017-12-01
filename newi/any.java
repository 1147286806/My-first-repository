package newi;

import java.util.Scanner;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

public class any {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入单价：");
		double uprice = scanner.nextDouble();
		System.out.println("请输入数量：");
		double num = scanner.nextDouble();
		double remoney = uprice * num;
		if (remoney >= 500) {
			remoney *= 0.8;
		}
		System.out.println("应收金额为：" + remoney + "\n" + "实收金额为：");
		double money = scanner.nextDouble();
		while (money < remoney) {
			System.out.println("输入金额错误，请重新输入：");
			money = scanner.nextDouble();
		}
		double change = money - remoney;
		System.out.println("找零：" + change);
	}

	@Test
	public void test1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		int num = (int) (Math.random() * 5 + 1);
		System.out.println("请输入一个猜想数字：");
		int con;
		int i = 1;
		do {
			con = scanner.nextInt();
			if (con > 1000 || con < 0) {
				System.out.println("数字输入错误");
			} else if (num < con) {
				System.out.println("大了");
				i++;
			} else if (num > con) {
				System.out.println("小了");
				i++;
			} else if (con == 0) {
				System.out.println("你退出了");
				i++;
				break;
			} else {
				break;
			}
		} while (true);
		System.out.println("这个数字是：" + num + "你猜的次数是：" + i);
	}
}
