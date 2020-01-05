/*
ID: alextang
LANG: JAVA
TASK: mixmilk
*/
import java.io.*;
import java.util.*;

public class mixmilk {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("mixmilk.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));

		int[][] milk = new int[3][2];
		for (int i = 0; i < 3; i++) {
			String milkStr = f.readLine();
			milk[i][0] = Integer.parseInt(milkStr.split(" ")[0]);
			milk[i][1] = Integer.parseInt(milkStr.split(" ")[1]);

		}
		for (int i = 0; i < 33; i++) {
			pour(milk[0], milk[1]);
			pour(milk[1], milk[2]);
			pour(milk[2], milk[0]);
		}	
		pour(milk[0], milk[1]);
		
		for (int i = 0; i < 3; i++) {
			out.println(milk[i][1]);
		}
		out.close();
	}

	public static void pour(int[] milk1, int[] milk2) {
		int milk1_q = milk1[1];
		int milk2_q = milk2[1]; 
		int milk2_cap = milk2[0]; 
		int milk2_surplus = milk2_cap - milk2_q; 
		int pure = Math.min(milk1_q, milk2_surplus);
		
		milk1[1] -= pure;
		milk2[1] += pure;
	}
}








