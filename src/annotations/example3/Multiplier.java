/**
 * Project Name:java
 * File Name:Multiplier.java
 * Package Name:annotations.example3
 * Date:2014-8-12下午3:42:37
 *
 */

package annotations.example3;
/**
 * ClassName:Multiplier Function: TODO ADD FUNCTION. Date: 2014-8-12 下午3:42:37
 * 
 * @author 张猛
 */
@ExtractInterface("IMultiplier")
public class Multiplier {
	public int multiply(int x, int y) {
		int total = 0;
		for (int i = 0; i < x; i++)
			total = add(total, y);
		return total;
	}
	private int add(int x, int y) {
		return x + y;
	}
	public static void main(String[] args) {
		Multiplier m = new Multiplier();
		System.out.println("11*16 = " + m.multiply(11, 16));
	}
}
