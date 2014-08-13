/**
 * Project Name:java
 * File Name:UseCaseTracker.java
 * Package Name:annotations.example1
 * Date:2014-8-12下午2:40:10
 *
 */

package annotations.example1;
/**
 * ClassName:UseCaseTracker
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-12 下午2:40:10 
 * @author   张猛
 */
import java.lang.reflect.*;
import java.util.*;

public class UseCaseTracker {
	public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
		for (Method m : cl.getDeclaredMethods()) {
			UseCase uc = m.getAnnotation(UseCase.class);
			if (uc != null) {
				System.out.println("Found Use Case:" + uc.id() + " "
						+ uc.description());
				useCases.remove(new Integer(uc.id()));
			}
		}
		for (int i : useCases) {
			System.out.println("Warning: Missing use case-" + i);
		}
	}
	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 47, 48, 49, 50);
		trackUseCases(useCases, PasswordUtils.class);
	}
}
