package lesson8;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.*;

public class TestIO {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("demo.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("demo.out")));
	}
}
