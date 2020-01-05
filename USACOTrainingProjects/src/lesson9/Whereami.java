/*
ID: alextang
LANG: JAVA
TASK: Whereami
*/
import java.io.*;
import java.util.*;

public class Whereami {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("whereami.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("whereami.out")));

		String reader = f.readLine();
		int mailbox = Integer.parseInt(reader);
		reader = f.readLine();
		String str = reader;


		int k = mailbox;
		for (int i = 1; i <= str.length(); i++) {
			if(compare(i,str) == true && i < k) {
				k = i;
			}
		}
		
		
		
		
		out.println(k);
		out.close();
	}

	public static boolean compare(int i, String str) {
		boolean flag = true;
		if(i == str.length()) {
			return flag;
		}
		for (int j = 0; j < str.length() - i; j++) {
			String cut = str.substring(0, i);
			String compare = str.substring(j + 1, j + 1 + cut.length());
			if (cut.equals(compare)) {
				flag = false;
			} 
		}
		if(flag == true){
			str = str.substring(1, str.length());
			if(compare(i, str) == false) {
				flag = false;
			}
		}
		return flag;
	}
	
	

}










