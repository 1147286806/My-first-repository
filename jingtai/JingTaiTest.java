package jingtai;

public class JingTaiTest {
	public static void main(String[] args) {
		int[] array = {1,4,5,3,6,7,2,9,99};
		int max = JingTaiLei.max(array);
		System.out.println(max);
		JingTaiLei.maoPao(array);
		for (int i : array) {
			System.out.print(i + "  ");
		}
	}
}
