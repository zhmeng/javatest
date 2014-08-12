/**
 * Project Name:java
 * File Name:SwitchTest.java
 * Package Name:enums.RoShamBo
 * Date:2014-8-12上午10:05:17
 *
*/

package enums.RoShamBo;
/**
 * ClassName:SwitchTest
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-12 上午10:05:17 
 * @author   张猛
 */
public class SwitchTest {
	public static void main(String[] args){
		int i = 10;
		String s = "";
		switch(i){
			default:
			case 1:
				s += "I am 1,";
				break;
			case 2:
				s += "I am 2,";
				break;
			case 3:
				s += "I am 3,";
				break;
		}
		System.out.println(s);
	}
}

