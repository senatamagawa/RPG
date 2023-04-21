package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	
	public Fighter(String name, String weapon) {
		//Humanクラスに定義したコンストラクタ
		super(name, weapon);
		//ヒットポイントの値は乱数を振って決定
		this.hp = Dice.get(240,300);
		//攻撃力の値は乱数を振って決定
		this.offensive = Dice.get(17, 23);
	}
	
}
