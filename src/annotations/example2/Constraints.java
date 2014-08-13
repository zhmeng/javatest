/**
 * Project Name:java
 * File Name:Constraints.java
 * Package Name:annotations.example2
 * Date:2014-8-12下午2:54:30
 *
 */

package annotations.example2;
/**
 * ClassName:Constraints
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-12 下午2:54:30 
 * @author   张猛
 */
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {
	boolean primaryKey() default false;
	boolean allowNull() default true;
	boolean unique() default false;
}
