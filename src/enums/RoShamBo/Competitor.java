/**
 * Project Name:java
 * File Name:Competitor.java
 * Package Name:enums
 * Date:2014-8-12上午9:49:35
 *
 */

package enums.RoShamBo;

/**
 * ClassName:Competitor Function: TODO ADD FUNCTION. Date: 2014-8-12 上午9:49:35
 * 
 * @author 张猛
 */
public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}
