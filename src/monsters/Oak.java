package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	
	public Oak(String name, String weapon) {
		//Humanクラスに定義したコンストラクタ
		super(name, weapon);
		//ヒットポイントの値は乱数を振って決定
		this.hp = Dice.get(170,230);
		//攻撃力の値は乱数を振って決定
		this.offensive = Dice.get(9, 15);
	}
	
}
