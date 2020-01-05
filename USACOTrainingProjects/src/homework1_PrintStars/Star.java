package homework1_PrintStars;

/**
 * 
 * Star类
 * @author Lost_Rain
 * @date Dec 5, 2019 9:12:46 PM
 * @version 1.0
 * @TODO 
 *
 */
public class Star {
	private int lines;
	private boolean IsSpaced;

	public int getLines() {
		return lines;
	}

	/**
	 * 如果行数大于等于零继续打印，如果小于等于零报错
	 * @param lines
	 */
	public void setLines(int lines) {
		if (lines >= 0) {
			this.lines = lines;
		} else {
			System.out.println("error:lines_is_not_larger_than_0");
		}

	}

	public boolean isIsSpaced() {
		return IsSpaced;
	}

	public void setIsSpaced(boolean isSpaced) {
		IsSpaced = isSpaced;
	}

	public void print_Stars_Without_Space() {
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");

		}
	}

	public void print_Stars_With_Space() {
		for (int i = 0; i < lines; i++) {
			// 打印空格
			for (int j = lines; j > i + 1; j--) {
				System.out.print(" ");
			}
			// 打印星号左半部分
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			// 打印星号右半部分
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			// 换行
			System.out.print("\n");

		}
	}
}
