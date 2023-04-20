package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	
	public Slime(String name, String weapon) {
		//Humanクラスに定義したコンストラクタ
		super(name, weapon);
		//ヒットポイントの値は乱数を振って決定
		hp = Dice.get(70,130);
		//攻撃力の値は乱数を振って決定
		this.offensive = Dice.get(5, 11);
	}
	
}
