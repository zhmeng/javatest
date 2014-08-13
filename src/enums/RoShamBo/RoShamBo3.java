/**
 * Project Name:java
 * File Name:RoShamBo3.java
 * Package Name:enums.RoShamBo
 * Date:2014-8-12上午11:04:16
 *
 */

package enums.RoShamBo;
import static enums.RoShamBo.Outcome.*;
/**
 * ClassName:RoShamBo3 Function: TODO ADD FUNCTION. Date: 2014-8-12 上午11:04:16
 * 
 * @author 张猛
 */
public enum RoShamBo3 implements Competitor<RoShamBo3> {
	PAPER {
		@Override
		public Outcome compete(RoShamBo3 it) {
			switch (it) {
				default : // To placate the compiler
				case PAPER :
					return DRAW;
				case SCISSORS :
					return LOSE;
				case ROCK :
					return WIN;
			}
		}
	},
	SCISSORS {
		@Override
		public Outcome compete(RoShamBo3 it) {
			switch (it) {
				default :
				case PAPER :
					return WIN;
				case SCISSORS :
					return DRAW;
				case ROCK :
					return LOSE;
			}
		}
	},
	ROCK {
		@Override
		public Outcome compete(RoShamBo3 it) {
			switch (it) {
				default :
				case PAPER :
					return LOSE;
				case SCISSORS :
					return WIN;
				case ROCK :
					return DRAW;
			}
		}
	};
	@Override
	public abstract Outcome compete(RoShamBo3 it);
	public static void main(String[] args) {
		RoShamBo.play(RoShamBo3.class, 20);
	}
}
