public class Tabako implements Jihanki {

	// 商品名
	public String mName;

	// コンストラクタ
	public Tabako() {
		mName = "タバコ"; // 初期値
	}

	// 押されたボタンによって商品を決定する
	public void setItem(int button) {
		switch (button) {
		case 1:
			mName = "セブンスター";
			break;
		case 2:
			mName = "マルボロ";
			break;
		case 3:
			mName = "わかば";
			break;
		default:
			mName = "エラー!";
		}
	}

	// 商品名を取得する
	public String getItem() {
		return mName;
	}
}
