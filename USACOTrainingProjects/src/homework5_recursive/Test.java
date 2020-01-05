package homework5_recursive;

/**
 * 
 * 
 * Alex Tang
 * 
 * @date Dec 9, 2019 2:36:51 PM
 * @version 1.0
 * @TODO
 *
 */
public class Test {
	public static void main(String[] args) {
		String str = "abcba";
		String str2 = "abc";
		System.out.println(isPalindrome(str));
		System.out.println(isPalindrome(str2));

	}

	public static boolean isPalindrome(String str) {
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			if (str.length() > 2) {
				return isPalindrome(str.substring(1, str.length() - 1));
			} else if (str.length() <= 1)
				return true;

		}
		return false;
	}
}
