/**
 * Project Name:java
 * File Name:Member.java
 * Package Name:annotations.example2
 * Date:2014-8-12下午2:58:52
 *
 */

package annotations.example2;
/**
 * ClassName:Member Function: TODO ADD FUNCTION. Date: 2014-8-12 下午2:58:52
 * 
 * @author 张猛
 */
@DBTable(name = "MEMBER")
public class Member {
	@SQLString(30)
	String firstName;
	@SQLString(50) // default to value  默认代表的是value
	String lastName;
	@SQLInteger
	Integer age;
	@SQLString(value = 50, constraints = @Constraints(primaryKey = true))  // 有很多的元素，所以需要加上value.
	String handle;
	static int memberCount;
	public String getHandle() {
		return handle;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String toString() {
		return handle;
	}
	public Integer getAge() {
		return age;
	}
}
