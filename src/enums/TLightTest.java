/**
 * Project Name:java
 * File Name:TLightTest.java
 * Package Name:enums
 * Date:2014-8-11下午1:58:07
 *
*/

package enums;
/**
 * ClassName:TLightTest
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-11 下午1:58:07 
 * @author   张猛
 */
enum TLight{
    RED(30){
        @Override
		public TLight next(){
            return AMBER;
        }
        
    },
    AMBER(10){
        @Override
		public TLight next(){
            return GREEN;
        }
    },
    GREEN(10){
        @Override
		public TLight next(){
            return RED;
        }
    };
    public abstract TLight next();
    
    private int seconds;
    TLight(int seconds){
        this.seconds = seconds;
    }
    int getSeconds(){
        return seconds;
    }
    
}
public class TLightTest {
    public static void main(String[] args){
        for(TLight light : TLight.values()){
            System.out.printf("%10s: %d seconds, next is %s\n", light,
                light.getSeconds(), light.next());
        }
    }
}

