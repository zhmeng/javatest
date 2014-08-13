/**
 * Project Name:java
 * File Name:ExtractInterface.java
 * Package Name:annotations.example3
 * Date:2014-8-12下午3:41:05
 *
 */

package annotations.example3;
import java.lang.annotation.*;
/**
 * ClassName:ExtractInterface Function: TODO ADD FUNCTION. Date: 2014-8-12
 * 下午3:41:05
 * 
 * @author 张猛
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
	public String value();
}
