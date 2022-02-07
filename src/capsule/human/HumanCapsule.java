package capsule.human;

// 2個目のファイル
public class HumanCapsule {
	// privateのアクセス修飾子を設定して外部から隠蔽
	private String name;
	private int age;

	public HumanCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// nameのgetterメソッド(フィールドの値を取得するため)
	public String getName() {
		return this.name;
	}

	// nameのsetterメソッド(値を変更するため)
	public void setName(String name) {
		this.name = name;
	}

	// ageのgetterメソッド
	// ageは外部から変更禁止なので、setterメソッドは作成しない
	public int getAge() {
		return this.age;
	}

}
