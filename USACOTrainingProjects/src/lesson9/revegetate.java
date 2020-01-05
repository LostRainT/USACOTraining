
/*
ID: alextang
LANG: JAVA
TASK: revegetate
*/
import java.io.*;
import java.util.*;

public class revegetate {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("revegetate.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("revegetate.out")));

		String str1 = f.readLine();
		int n = Integer.parseInt(str1.split(" ")[0]);
		int m = Integer.parseInt(str1.split(" ")[1]);
		int[][] fields = new int[m][2];
		for (int i = 0; i < m; i++) {
			String str2 = f.readLine();
			for (int j = 0; j < 2; j++) {
				fields[i][j] = Integer.parseInt(str2.split(" ")[j]);
			}
			if (fields[i][0] > fields[i][1]) {
				swap(fields[i][0], fields[i][1]);
			}
		}

		for (int i = 0; i < n; i++) {
			if
		}

//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		for (int i = 1; i < n; i++) {
//			boolean flag1 = true;
//			boolean flag2 = true;
//			for (int j = 0; j < m; j++) {
//				if ((fields[j][0] == i) && (fields[j][1] == (fields[j][0] + 1))) {
//					if (fields[j][1] == i) {
//						flag1 = false;
//					} else {
//						flag2 = false;
//					}
//				}
//				else if (fields[j][1] == i) {
//					flag1 = false;
//				}
//			}
//			if (flag2 == false && flag1 == false) {
//				list.add(list.get(i - 1) + 2);
//			}
//			else if(flag2 == false && flag1 == true) {
//				list.add(list.get(i - 1) + 1);
//			}
//			else if(flag2 == true && flag1 == false) {
//				list.add(list.get(i - 1) + 3);
//			}
//			else {
//				list.add(1);
//			}
//		}

		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			strList.add(list.get(i).toString());
		}
		String str = "";
		for (int i = 0; i < strList.size(); i++) {
			str += strList.get(i);
		}
		int ans = Integer.parseInt(str);

		out.println(ans);
		out.close();

	}

	public static void swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
	}
}
