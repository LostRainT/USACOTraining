//package homework3_warp;
//
//import java.util.ArrayList;
//
//public class warp {
//	public static void main(String[] args) {
//		int a = 1;
//		int b = 2;
//		warpTwoNums(a, b); 	
//
//	}
//
//	public static void warpTwoNums(int a, int b) {
//		ArrayList<Integer> result = new ArrayList<Integer>();
//		result.add(a);
//		result.add(b);
//		result.add(0);
//		result.set(2, a);
//		result.set(0, b);
//		result.set(1, result.get(2));
//		System.out.println(result.get(0));
//		System.out.println(result.get(1));
//
//	}
//}
package homework3_warp;

import java.util.ArrayList;

public class warp {
	public static void main(String[] args) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int a = 1;
		int b = 2;
		result.add(a);//0
		result.add(b);//1
		warpTwoNums(result); 
		System.out.println(result.get(0));
		
		System.out.println(result.get(1));

	}

	public static void warpTwoNums(ArrayList<Integer> list) {
		int a=list.get(0);
		int b=list.get(1);
		
		list.add(0);
		list.set(2, a);						
		list.set(0, b);
		list.set(1, list.get(2));
	}
	Throwable
	Exception;
	

}