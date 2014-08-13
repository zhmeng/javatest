/**
 * Project Name:java
 * File Name:SimulatingNull.java
 * Package Name:annotations
 * Date:2014-8-12下午2:50:21
 *
*/

package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:SimulatingNull
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-12 下午2:50:21 
 * @author   张猛
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {
	public int id() default -1;
	public String description() default "";
}