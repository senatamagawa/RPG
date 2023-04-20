package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	
	public Brave(String name, String weapon) {
		//Humanクラスに定義したコンストラクタ
		super(name, weapon);
		//ヒットポイントの値は乱数を振って決定
		hp = Dice.get(170,230);
		//攻撃力の値は乱数を振って決定
		this.offensive = Dice.get(7, 13);
	}

}
