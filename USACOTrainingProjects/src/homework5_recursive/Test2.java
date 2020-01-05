package homework5_recursive;
/*
ID: lost_rain@163.com
LANG: JAVA
TASK: 
*/

/**
 * 
 * 判断回文字符串 v2.0
 * 
 * @author Lost_Rain
 * @date Dec 10, 2019 10:24:47 AM
 * @version 2.0
 * @TODO
 *
 */
public class Test2 {
	public static void main(String[] args) {
		
		String str1 = "abcba";
		String str2 = "abc";
		
		System.out.println(isPalindrome(str1));
		System.out.println(isPalindrome(str2));
	}

	public static boolean isPalindrome(String str) {
		if(str.length() <= 1) {
			return true;
		}
		else {
			int i = 0;
			int j = str.length() - 1;
			while(i != j) {
				if(str.charAt(i) == str.charAt(j)) {
					i++;
					j--;
				}else {
					return false;
				}
			}
		}
		return true;
	}
}
