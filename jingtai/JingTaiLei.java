package jingtai;

public class JingTaiLei {
	
	public static int max(int[] array) {
		int max = array[0];
	      for (int i = 1; i < array.length; i++) {
	         if (max < array[i]) {
	            max = array[i];
	         }
	      }
	      return max;
	}
	
	public static void maoPao(int[] array) {
		for (int i = 1; i < array.length-1; i++) {
			for (int j = 0; j < array.length-i; j++) {
				if(array[j] > array[j+1]){
					chang(array, j, j+1);
				}
			}
		}
	}
	
	public static void chang(int[] array,int x, int y) {
		int temp = array [x];
		array[x] = array[y];
		array[y] = temp;
	}
}
