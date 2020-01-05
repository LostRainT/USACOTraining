package lesson3;

import java.util.*;

public class lesson3 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(1, 1);

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		int[][] arr1 = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5, 6 } };
		int[] sums = new int[arr1.length];
		for (int i = 0;i<arr1.length; i++) {
			for(int j = 0;j<arr1[i].length;j++) {
				sums[i] += arr1[i][j];
			}
		}
		for(Integer i : sums) {
			System.out.println(i);
		}
	}
}
