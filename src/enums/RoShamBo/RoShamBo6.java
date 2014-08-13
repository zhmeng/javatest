/**
 * Project Name:java
 * File Name:RoShamBo6.java
 * Package Name:enums.RoShamBo
 * Date:2014-8-12上午11:19:24
 *
 */

package enums.RoShamBo;
import static enums.RoShamBo.Outcome.*;
/**
 * ClassName:RoShamBo6 Function: TODO ADD FUNCTION. Date: 2014-8-12 上午11:19:24
 * 
 * @author 张猛
 */
enum RoShamBo6 implements Competitor<RoShamBo6> { // the best.
	PAPER, SCISSORS, ROCK;
	private static Outcome[][] table = {{DRAW, LOSE, WIN}, // PAPER
			{WIN, DRAW, LOSE}, // SCISSORS
			{LOSE, WIN, DRAW}, // ROCK
	};
	@Override
	public Outcome compete(RoShamBo6 other) {
		return table[this.ordinal()][other.ordinal()];
	}
	public static void main(String[] args) {
		RoShamBo.play(RoShamBo6.class, 20);
	}
}
