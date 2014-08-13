/**
 * Project Name:java
 * File Name:Uniqueness.java
 * Package Name:annotations.example2
 * Date:2014-8-12下午2:57:36
 *
 */

package annotations.example2;
/**
 * ClassName:Uniqueness Function: TODO ADD FUNCTION. Date: 2014-8-12 下午2:57:36
 * 
 * @author 张猛
 */
public @interface Uniqueness {
	Constraints constraints() default @Constraints(unique = true);
}
