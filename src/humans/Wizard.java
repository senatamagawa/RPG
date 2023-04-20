package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	
	public Wizard(String name, String weapon) {
		//Humanクラスに定義したコンストラクタ
		super(name, weapon);
		//ヒットポイントの値は乱数を振って決定
		hp = Dice.get(120,180);
		//攻撃力の値は乱数を振って決定
		this.offensive = Dice.get(12, 18);
	}
	
}
