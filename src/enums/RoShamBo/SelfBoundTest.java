/**
 * Project Name:java
 * File Name:SelfBoundTest.java
 * Package Name:enums.RoShamBo
 * Date:2014-8-12上午10:14:29
 *
*/

package enums.RoShamBo;
/**
 * ClassName:SelfBoundTest
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-12 上午10:14:29 
 * @author   张猛
 */
interface GetMySelf<T extends GetMySelf<T>>{
	void setMs(T t);
	T getMs();
}
class PassData{
	public <T extends GetMySelf<T>> T setData(T t){
		return t;
	}
}
class SelfBoundTest1 implements GetMySelf<SelfBoundTest1>{
	@Override
	public void setMs(SelfBoundTest1 t) {
	}

	@Override
	public SelfBoundTest1 getMs() {
		System.out.println("I am SelfBoundTest1");
		return null;
	}
	
}

public class SelfBoundTest implements GetMySelf<SelfBoundTest1>{
	@Override
	public SelfBoundTest1 getMs() {
		return null;
	}
	@Override
	public void setMs(SelfBoundTest1 t) {
	}
	public static void main(String[] args){
		GetMySelf<SelfBoundTest1> gms = new PassData().setData(new SelfBoundTest1());
		gms.getMs();
	}
}

