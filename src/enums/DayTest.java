/**
 * Project Name:java
 * File Name:DayTest.java
 * Package Name:enums
 * Date:2014-8-11下午2:02:24
 *
*/

package enums;
/**
 * ClassName:DayTest
 * Function: TODO ADD FUNCTION.
 * Date:     2014-8-11 下午2:02:24 
 * @author   张猛
 */
enum Day{
     MONDAY(1) {
        @Override
		public Day next() { return TUESDAY; }   // each instance provides its implementation to abstract method
     },
     TUESDAY(2) {
        @Override
		public Day next() { return WEDNESDAY; }
     },
     WEDNESDAY(3) {
        @Override
		public Day next() { return THURSDAY; }
     },
     THURSDAY(4) {
        @Override
		public Day next() { return FRIDAY; }
     },
     FRIDAY(5) {
        @Override
		public Day next() { return SATURDAY; }
     },
     SATURDAY(6) {
        @Override
		public Day next() { return SUNDAY; }
     },
     SUNDAY(7) {
        @Override
		public Day next() { return MONDAY; }
     };
   
     public abstract Day next(); // 构造函数 enum 如同父类和一群子类的集合。
     
     private final int dayNumber;
   
     Day(int dayNumber) {   // constructor
        this.dayNumber = dayNumber;
     }
   
     int getDayNumber() {
        return dayNumber;
     }
}
public class DayTest {
    public static void main(String[] args){
        for(Day day : Day.values()){
            System.out.printf("%s (%d), next is %s\n", day, day.getDayNumber(), day.next());
        }
    }
}

