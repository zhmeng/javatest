/**
 * Project Name:java
 * File Name:TrafficLight.java
 * Package Name:enums
 * Date:2014-8-9下午5:18:26
 *
*/

package enums;
/**
 * ClassName:TrafficLight
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-9 下午5:18:26 
 * @author   张猛
 */
enum TrafficLight {
    RED(30), AMBER(10), GREEN(30);  // Named constants
    private  int seconds;      // Private variable
    TrafficLight(int seconds) {     // Constructor
       this.seconds = seconds;
    }
    int getSeconds() {              // Getter
       return seconds;
    }
 }
  
 public class TrafficLightTest {
    public static void main(String[] args) {
       for (TrafficLight light : TrafficLight.values()) {
          System.out.printf("%s: %d seconds\n", light, light.getSeconds());
       }
    }
 }