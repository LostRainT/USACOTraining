/*
ID: alextang
LANG: JAVA
TASK: backforth 
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class backforth {
	public static int[] tmp=new int[2001]; // 1001,1002,1003,1004,1005 位置
	                         //  1,   ,1 , 1,   1,   1 值
	public static void main (String [] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("backforth.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("backforthawdawdadawwwwwwwwwwww.out")));
		String str1=f.readLine();
		String str2=f.readLine();
		ArrayList<Integer> b1=new ArrayList<>();
		ArrayList<Integer> b2=new ArrayList<>();
		for(int i=0;i<10;i++){
			b1.add(Integer.parseInt(str1.split(" ")[i]));
			b2.add(Integer.parseInt(str2.split(" ")[i]));
		}
		tuesday(1000,b1,b1);
		int ans=0;
		for(int i=0;i<tmp.length;i++){
			ans+=tmp[i];
		}
		out.println(tmp);
		out.close();
		                            // dfs,深度优先遍历
	}
	public static void tuesday(int b1milk,ArrayList<Integer> b1,ArrayList<Integer> b2){
		for(int i=0;i<b1.size();i++){
			int milknum=b1.get(i);

			ArrayList<Integer> new_b1=new ArrayList<>();
			ArrayList<Integer> new_b2=new ArrayList<>();
			new_b1.addAll(b1);
			new_b2.addAll(b2);
			new_b1.remove(i);
			new_b2.add(milknum);
			wednesday(b1milk-milknum,new_b1,new_b2);
			
		}
		
	}
	public static void wednesday(int b1milk,ArrayList<Integer> b1,ArrayList<Integer> b2){
		for(int i=0;i<b2.size();i++){
			int milknum=b1.get(i);
			ArrayList<Integer> new_b1=new ArrayList<>();
			ArrayList<Integer> new_b2=new ArrayList<>();
			new_b1.addAll(b1);
			new_b2.addAll(b2);
			new_b2.remove(i);
			new_b1.add(milknum);
			thursday(b1milk+milknum,new_b1,new_b2);
		}
	}
	public static void thursday(int b1milk,ArrayList<Integer> b1,ArrayList<Integer> b2){
		for(int i=0;i<b1.size();i++){
			int milknum=b1.get(i);
			ArrayList<Integer> new_b1=new ArrayList<>();
			ArrayList<Integer> new_b2=new ArrayList<>();
			new_b1.addAll(b1);
			new_b2.addAll(b2);
			new_b1.remove(i);
			new_b2.add(milknum);
			friday(b1milk-milknum,new_b1,new_b2);
		}
	}
	public static void friday(int b1milk,ArrayList<Integer> b1,ArrayList<Integer> b2){
		for(int i=0;i<b2.size();i++){
			int milknum=b2.get(i);
			tmp[b1milk+milknum]=1;
		}
	}

}
