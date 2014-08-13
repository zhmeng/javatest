/**
 * Project Name:java
 * File Name:DBTable.java
 * Package Name:annotations.example2
 * Date:2014-8-12下午2:53:09
 *
*/

package annotations.example2;
import java.lang.annotation.*;
/**
 * ClassName:DBTable
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-12 下午2:53:09 
 * @author   张猛
 */
@Target(ElementType.TYPE) // Applies to classes only
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
	public String name() default "";
}

