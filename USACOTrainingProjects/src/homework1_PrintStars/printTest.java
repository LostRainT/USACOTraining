	package homework1_PrintStars;

/**
 * 
 * 
 * @author Lost_Rain
 * @date Dec 5, 2019 8:31:47 PM
 * @version 1.0
 * @TODO
 *
 */

public class printTest {
	public static void main(String[] args) {
		Star star = new Star();
		star.setLines(4);

		star.setIsSpaced(true);
		star.print_Stars_With_Space();
		System.out.println("行数：" + star.getLines());
		System.out.println("是否前面有空格：" + star.isIsSpaced());

		star.setIsSpaced(false);
		star.print_Stars_Without_Space();
		System.out.println("行数：" + star.getLines());
		System.out.println("是否前面有空格：" + star.isIsSpaced());

	}
}
