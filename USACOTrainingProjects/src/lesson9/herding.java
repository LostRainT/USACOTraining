
/*
ID: alextang
LANG: JAVA
TASK: herding
*/
import java.io.*;
import java.util.*;

public class herding {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("herding.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("herding.out")));

		String str = f.readLine();
		int[] cows = new int[3];
		for (int i = 0; i < 3; i++) {
			cows[i] = Integer.parseInt(str.split(" ")[i]);
		}

		Arrays.sort(cows);

		int d1_temp = cows[2] - cows[1];
		int d2_temp = cows[1] - cows[0];
		int d1 = 0;
		int d2 = 0;
		int min = 0;
		int max = 0;

		if (d1_temp == 2) {
			d1 = 1;
			d2 = d2_temp - 1;
			min = 1;
			max = Math.max(d1, d2);

		}
		else if (d2_temp == 2) {
			d1 = d1_temp - 1;
			d2 = 1;
			min = 1;
			max = Math.max(d1, d2);

		}
		else if ((d1_temp == 1) && (d2_temp == 1)) {
			d1 = 0;
			d2 = 0;
			min = 0;
			max = Math.max(d1, d2);
		}
		else {
			d1 = d1_temp - 1;
			d2 = d2_temp - 1;
			min = 2;
			max = Math.max(d1, d2);
		}

		out.println(min);
		out.println(max);
		out.close();

	}
}