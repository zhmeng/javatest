/**
 * Project Name:java
 * File Name:Enums.java
 * Package Name:enums.RoShamBo
 * Date:2014-8-12上午9:55:39
 *
 */

package enums.RoShamBo;

import java.util.Random;

/**
 * ClassName:Enums Function: TODO ADD FUNCTION. Date: 2014-8-12 上午9:55:39
 * 
 * @author 张猛
 */
public class Enums {
	private static Random rand = new Random(47);
	public static <T extends Enum<T>> T random(Class<T> ec) {
		return random(ec.getEnumConstants());
	}
	public static <T> T random(T[] values) {
		return values[rand.nextInt(values.length)];
	}
}
