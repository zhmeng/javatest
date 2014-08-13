/**
 * Project Name:java
 * File Name:UseCase.java
 * Package Name:annotations
 * Date:2014-8-12下午2:35:53
 *
*/

package annotations.example1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:UseCase
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-12 下午2:35:53 
 * @author   张猛
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
	public int id();
	public String description() default "no description";
}

