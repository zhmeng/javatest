/**
 * Project Name:java
 * File Name:AnnotationOverrideTest.java
 * Package Name:annotations
 * Date:2014-8-12下午2:26:21
 *
*/

package annotations;
/**
 * ClassName:AnnotationOverrideTest
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-12 下午2:26:21 
 * @author   张猛
 */
public class AnnotationOverrideTest {
	@Override
	public String toString(){
		return "it's a Annotation test..";
	}
	//@Override error!
	public void otherMethod(){
	}
	
}

