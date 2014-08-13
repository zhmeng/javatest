/**
 * Project Name:java
 * File Name:RoShamBo2.java
 * Package Name:enums
 * Date:2014-8-12上午9:48:55
 *
 */

package enums.RoShamBo;
import static enums.RoShamBo.Outcome.*;
/**
 * ClassName:RoShamBo2 Function: TODO ADD FUNCTION. Date: 2014-8-12 上午9:48:55
 * 
 * @author 张猛
 */
public enum RoShamBo2 implements Competitor<RoShamBo2> {
	PAPER(DRAW, LOSE, WIN), SCISSORS(WIN, DRAW, LOSE), ROCK(LOSE, WIN, DRAW);
	private Outcome vPAPER, vSCISSORS, vROCK;
	RoShamBo2(Outcome paper, Outcome scissors, Outcome rock) {
		this.vPAPER = paper;
		this.vSCISSORS = scissors;
		this.vROCK = rock;
	}
	@Override
	public Outcome compete(RoShamBo2 it) {
		switch (it) {
			default :
			case PAPER :
				return vPAPER;
			case SCISSORS :
				return vSCISSORS;
			case ROCK :
				return vROCK;
		}
	}
	public static void main(String[] args) {
		RoShamBo.play(RoShamBo2.class, 20);
	}
}
