package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	
	public Dragon(String name, String weapon) {
		//Humanクラスに定義したコンストラクタ
		super(name, weapon);
		//ヒットポイントの値は乱数を振って決定
		hp = Dice.get(270,330);
		//攻撃力の値は乱数を振って決定
		this.offensive = Dice.get(12, 18);
	}
	
}
