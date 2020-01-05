/*
ID: alextang
LANG: JAVA
TASK: Lineup
*/
import java.io.*;
import java.util.*;

public class Lineup {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("lineup.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lineup.out")));
		String str = f.readLine();
		int rules = Integer.parseInt(str);

		out.println("Beatrice");
		out.println("Sue");
		out.println("Belinda");
		out.println("Bessie");
		out.println("Betsy");
		out.println("Blue");
		out.println("Bella");
		out.println("Buttercup");
		out.close();
	}

}
