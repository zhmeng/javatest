/**
 * Project Name:java
 * File Name:SQLInteger.java
 * Package Name:annotations.example2
 * Date:2014-8-12下午2:55:38
 *
 */

package annotations.example2;
/**
 * ClassName:SQLInteger
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-12 下午2:55:38 
 * @author   张猛
 */
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLInteger {
	String name() default "";
	Constraints constraints() default @Constraints;
	//~~the default value of constraints( ) is actually an @Constraints annotation with its own default values set
}
