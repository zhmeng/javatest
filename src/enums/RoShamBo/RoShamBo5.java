/**
 * Project Name:java
 * File Name:RoShamBo5.java
 * Package Name:enums.RoShamBo
 * Date:2014-8-12上午11:15:23
 *
 */

package enums.RoShamBo;

import java.util.EnumMap;
import static enums.RoShamBo.Outcome.*;
/**
 * ClassName:RoShamBo5 Function: TODO ADD FUNCTION. Date: 2014-8-12 上午11:15:23
 * 
 * @author 张猛
 */
enum RoShamBo5 implements Competitor<RoShamBo5> {
	PAPER, SCISSORS, ROCK;
	static EnumMap<RoShamBo5, EnumMap<RoShamBo5, Outcome>> table = new EnumMap<RoShamBo5, EnumMap<RoShamBo5, Outcome>>(
			RoShamBo5.class);
	static {
		for (RoShamBo5 it : RoShamBo5.values())
			table.put(it, new EnumMap<RoShamBo5, Outcome>(RoShamBo5.class));
		initRow(PAPER, DRAW, LOSE, WIN);
		initRow(SCISSORS, WIN, DRAW, LOSE);
		initRow(ROCK, LOSE, WIN, DRAW);
	}
	static void initRow(RoShamBo5 it, Outcome vPAPER, Outcome vSCISSORS,
			Outcome vROCK) {
		EnumMap<RoShamBo5, Outcome> row = RoShamBo5.table.get(it);
		row.put(RoShamBo5.PAPER, vPAPER);
		row.put(RoShamBo5.SCISSORS, vSCISSORS);
		row.put(RoShamBo5.ROCK, vROCK);
	}
	public Outcome compete(RoShamBo5 it) {
		return table.get(this).get(it);
	}
	public static void main(String[] args) {
		RoShamBo.play(RoShamBo5.class, 20);
	}
}
