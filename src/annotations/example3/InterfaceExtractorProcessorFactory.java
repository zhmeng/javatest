/**
 * Project Name:java
 * File Name:InterfaceExtractorProcessorFactory.java
 * Package Name:annotations.example3
 * Date:2014-8-12下午4:13:28
 *
 */

package annotations.example3;
/**
 * ClassName:InterfaceExtractorProcessorFactory
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-12 下午4:13:28 
 * @author   张猛
 */
import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;
import java.util.*;
public class InterfaceExtractorProcessorFactory
		implements
			AnnotationProcessorFactory {
	public AnnotationProcessor getProcessorFor(
			Set<AnnotationTypeDeclaration> atds,
			AnnotationProcessorEnvironment env) {
		return new InterfaceExtractorProcessor(env);
	}
	public Collection<String> supportedAnnotationTypes() {
		return Collections.singleton("annotations.example3.ExtractInterface");
	}
	public Collection<String> supportedOptions() {
		return Collections.emptySet();
	}
}
