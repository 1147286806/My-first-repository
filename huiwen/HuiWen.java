package huiwen;

import java.util.Scanner;

import org.junit.Test;

public class HuiWen {
	
	@Test
	public void huiWen() {
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		char[] numarry = num.toCharArray();
		boolean huiwen = true;
		for (int i = 0; i < numarry.length/2; i++) {
			if (numarry[i] != numarry[numarry.length-i-1]) {
				huiwen = false;
			}
		}
		if (huiwen == true) {
			System.out.println("是回文");
		}else {
			System.out.println("不是回文");
		}
	}
}
