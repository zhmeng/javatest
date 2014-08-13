/**
 * Project Name:java
 * File Name:PasswordUtils.java
 * Package Name:annotations
 * Date:2014-8-12下午2:38:07
 *
 */

package annotations.example1;

import java.util.List;

/**
 * ClassName:PasswordUtils Function: TODO ADD FUNCTION. Date: 2014-8-12
 * 下午2:38:07
 * 
 * @author 张猛
 */
public class PasswordUtils {
	@UseCase(id = 47, description = "Passwords must contain at least one numeric")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}
	@UseCase(id = 48)
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}
	@UseCase(id = 49, description = "New passwords can’t equal previously used ones")
	public boolean checkForNewPassword(List<String> prevPasswords,
			String password) {
		return !prevPasswords.contains(password);
	}
}
