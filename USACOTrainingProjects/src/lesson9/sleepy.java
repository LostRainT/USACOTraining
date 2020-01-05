 /*
ID: alextang
LANG: JAVA
TASK: 
*/

import java.io.*;
import java.util.*;

public class sleepy {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("sleepy.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sleepy.out")));

		int n = Integer.parseInt(f.readLine());
		int[] arr = new int[n];
		String str = f.readLine();
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str.split(" ")[i]);
		}

		int ans = 0;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > arr[i + 1]) {
				ans = i + 1;
				break;
			}
		}
		out.println(ans);
		out.close();

	}
}