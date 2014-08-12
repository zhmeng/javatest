/**
 * Project Name:java
 * File Name:RoShamBo.java
 * Package Name:enums
 * Date:2014-8-12上午9:53:12
 *
 */

package enums.RoShamBo;
/**
 * ClassName:RoShamBo Function: TODO ADD FUNCTION. Date: 2014-8-12 上午9:53:12
 * 
 * @author 张猛
 */
public class RoShamBo {
	public static <T extends Competitor<T>> void match(T a, T b) {
		System.out.println(a + " vs. " + b + ": " + a.compete(b));
	}
	public static <T extends Enum<T> & Competitor<T>> void play( // & 同时集成与两个
			Class<T> rsbClass, int size) {
		for (int i = 0; i < size; i++)
			match(Enums.random(rsbClass), Enums.random(rsbClass));
	}
}
