package ismycar;

import java.util.Scanner;

import org.junit.Test;

public class VehicleTest {
	
	public static void main(String[] agrs){
		Scanner scanner = new Scanner(System.in);
		System.out.println("按1启动汽车：");
		int start = scanner.nextInt();
		if(start == 1){
			System.out.println("请输入速度：");
			int speed = scanner.nextInt();
			System.out.println("请输入体积：");
			int size = scanner.nextInt();
			Vehicle carmessage = new Vehicle();
			carmessage.setSpeed(speed);
			carmessage.setSize(size);
			System.out.println(carmessage);
			carmessage.speedUp();
			System.out.println("车辆加速后为："+carmessage);
			carmessage.speedDown();
			System.out.println("车辆减速后为："+carmessage);
		}else {
			System.out.println("启动失败！");
		}
	}
	
	/*public void main() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入速度：");
		int speed = scanner.nextInt();
		System.out.println("请输入体积：");
		int size = scanner.nextInt();
		Vehicle carmessage = new Vehicle();
		carmessage.setSpeed(speed);
		carmessage.setSize(size);
		System.out.println(carmessage);
		carmessage.speedUp();
		System.out.println("车辆加速后为："+carmessage);
		carmessage.speedDown();
		System.out.println("车辆减速后为："+carmessage);
		
	}*/
}
