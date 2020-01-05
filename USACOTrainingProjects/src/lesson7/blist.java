/*
ID: alextang
LANG: JAVA
TASK: blist 
*/

import java.io.*;
import java.util.*;

public class blist {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("blist.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));

		int n = Integer.parseInt(f.readLine());
		int[] s = new int[n];
		int[] t = new int[n];
		int[] b = new int[n];

		int answer = 0;

		for (int i = 0; i < n; i++) {
			String str = f.readLine();
			s[i] = Integer.parseInt(str.split(" ")[0]);
			t[i] = Integer.parseInt(str.split(" ")[1]);
			b[i] = Integer.parseInt(str.split(" ")[2]);

		}

		for (int i = 0; i < 1000; i++) {
			int bucket_now = 0;
			for (int j = 0; j < n; j++) {
				if (i >= s[j] && i <= t[j]) {
					bucket_now += b[j];
				}
			}
			if (bucket_now >= answer) {
				answer = bucket_now;
			}
			
		}
		out.println(answer);
		out.close();
	}
}
