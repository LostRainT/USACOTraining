package lesson8;

/*
ID: alextang
LANG: JAVA
TASK: shell
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class shell {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("shell.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));

		int swapTimes = Integer.parseInt(f.readLine());
		int[] a = new int[swapTimes];
		int[] b = new int[swapTimes];
		int[] g = new int[swapTimes];

		for (int i = 0; i < swapTimes; i++) {
			String str = f.readLine();
			a[i] = Integer.parseInt(str.split(" ")[0]);
			b[i] = Integer.parseInt(str.split(" ")[1]);
			g[i] = Integer.parseInt(str.split(" ")[2]);
		}


		int swapTimes = 3;
		int[] a = { 1, 3, 1 };
		int[] b = { 2, 2, 3 };
		int[] g = { 1, 1, 1 };
		int[] temps = { 1, 2, 3 };
		ArrayList<Integer> ans = new ArrayList<Integer>();

		Stone stone = new Stone();
		
		int sum = 0;
		stone.setNut(3);
		swap(a[2], b[2], g[2], ans, stone);
		for(int i = 0 ; i < ans.size();i++) {
			sum += ans.get(i);
		}
		System.out.println(sum);
	
		
		
		
		
//		int[] arr1 = { 1, 2, 3};
//		for (int i = 0; i < swapTimes; i++) {
//			int temp = arr1[a[i]-1];
//			arr1[a[i]-1] = arr1[b[i]-1];
//			arr1[b[i]-1] = temp;
//			
//			System.out.println(arr1[0]);
//		}

	}

//	public static boolean swap(int a, int b, int g, int correct) {
//		if ((correct != a) && (correct != b)) {
//			if (correct == g) {
//				return true;
//			} else {
//				return false;
//			}
//		} else if (correct == a) {
//			if (g == b) {
//				return true;
//			} else {
//				return false;
//			}
//		} else if (correct == b) {
//			if (g == a) {
//				return true;
//			} else {
//				return false;
//			}
//		} else {
//			return false;
//		}
//	}

	public static void swap(int a, int b, int g, ArrayList<Integer> ans, Stone stone) {
		if (stone.getNut() == a) {
			if (g == b) {
				ans.add(1);
				stone.setNut(b);
			} else {
				stone.setNut(b);
			}
		} else if (stone.getNut() == b) {
			if (g == a) {
				ans.add(1);
				stone.setNut(a);
			} else {
				stone.setNut(a);
			}
		} else if ((stone.getNut() != a) && (stone.getNut() != b)) {
			if(g == stone.getNut()) {
				ans.add(1);
			}
		}
	}

}

class Stone {
	private int nut;

	public int getNut() {
		return nut;
	}

	public void setNut(int nut) {
		this.nut = nut;
	}

}
