/**
 * Project Name:java
 * File Name:RoShamBo4.java
 * Package Name:enums.RoShamBo
 * Date:2014-8-12上午11:13:40
 *
 */

package enums.RoShamBo;
/**
 * ClassName:RoShamBo4 Function: TODO ADD FUNCTION. Date: 2014-8-12 上午11:13:40
 * 
 * @author 张猛
 */
public enum RoShamBo4 implements Competitor<RoShamBo4> {
	ROCK {
		public Outcome compete(RoShamBo4 opponent) {
			return compete(SCISSORS, opponent);
		}
	},
	SCISSORS {
		public Outcome compete(RoShamBo4 opponent) {
			return compete(PAPER, opponent);
		}
	},
	PAPER {
		public Outcome compete(RoShamBo4 opponent) {
			return compete(ROCK, opponent);
		}
	};
	Outcome compete(RoShamBo4 loser, RoShamBo4 opponent) {
		return ((opponent == this) ? Outcome.DRAW : ((opponent == loser)
				? Outcome.WIN
				: Outcome.LOSE));
	}
	public static void main(String[] args) {
		RoShamBo.play(RoShamBo4.class, 20);
	}
}
