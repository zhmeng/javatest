/**
 * Project Name:java
 * File Name:SQLString.java
 * Package Name:annotations.example2
 * Date:2014-8-12下午2:55:06
 *
 */

package annotations.example2;
/**
 * ClassName:SQLString
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-12 下午2:55:06 
 * @author   张猛
 */
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {
	String name() default "";
	int value() default -1;
	Constraints constraints() default @Constraints;
}
