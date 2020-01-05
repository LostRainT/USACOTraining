/*
ID: alextang
LANG: JAVA
TASK: Gymnastics
*/

import java.io.*;
import java.util.*;

public class Gymnastics {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("gymnastics.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));

		String str = f.readLine();
		int K = Integer.parseInt(str.split(" ")[0]);
		int N = Integer.parseInt(str.split(" ")[1]);

		int[][] ranks = new int[K][N];
		for (int i = 0; i < K; i++) {
			str = f.readLine();
			for (int j = 0; j < N; j++) {
				ranks[i][j] = Integer.parseInt(str.split(" ")[j]);
			}
		}


		int ans = 0;
		for (int i = 1; i <= N; i++) {
			ans += ans4EachCow(i, N, K, ranks);
		}
		out.println(ans);
		out.close();
		

	}

	public static int ans4EachCow(int c, int N, int K, int[][] ranks) {
		int ans = 0;
		int[][] ranks2 = new int[K][N - 1];
		for (int j = 0; j < K; j++) {
			for (int k = 0; k < N; k++) {

				if (ranks[j][k] == c) {
					for (int n = 0; n < (N - 1 - k); n++) {
						ranks2[j][n] = ranks[j][k + 1 + n];
					}
				}

			}
		}

		for (int i = 0; i < N; i++) {
			int smallerTimes = 0;
			for (int j = 0; j < K; j++) {
				for (int k = 0; k < N - 1; k++) {
					if (ranks2[j][k] == i + 1) {
						smallerTimes += 1;
					}
				}
			}
			if (smallerTimes == K) {
				ans += 1;
			}
		}
		return ans;
	}
}
