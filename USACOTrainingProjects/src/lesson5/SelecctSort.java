package lesson5;

/**
 * 选择排序
 * 
 * @author Lost_Rain
 * @date Dec 9, 2019 11:50:23 AM
 * @version 1.0
 * @TODO
 *
 */
public class SelecctSort {
	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 2, 5, 7, 5, 3 };

		for (int i = 0; i < arr1.length; i++) {
			int min = arr1[i];
			int minidx = i;
			for (int j = i; j < arr1.length; j++) {
				if (arr1[j] < min) {
					min = arr1[j];
					minidx = j;
				}
			}
			int tmp = arr1[i];
			arr1[i] = min;
			arr1[minidx] = tmp;
		}
		for (Integer i : arr1) {
			System.out.println(i);
		}
	}

}
