package jp.co.favoriteanime.entity;

/**
 * アニメの情報
 * 
 * @author yoko
 */
public class Anime {
	
	//アニメタイトルNo　フィールド　
	private int titleNo;
	//アニメタイトル　フィールド
	private String title;
	//メモ　フィールド
	private String memo;
	
	/**
	 * コンストラクタ（初めに1回だけメソッド）タイヤキ機を元に、たい焼きが生まれた時！！（インスタンス化）
	 * @param titleNo　　コンストラクタで情報を渡す
	 * @param title
	 * @param memo
	 */
	public Anime(int titleNo, String title, String memo) {  //この3つの引数が渡されたら
		this.titleNo = titleNo;   //それぞれのフィールドの変数を使う時にthisを書くよ
		this.title = title;   //フィールドを呼び出す（アクセスする）→取り出すこともできるし、入れることもできる出し入れ自由
		this.memo = memo;  //フィールドにアクセスする時にthisをつける！→覚えろ！！
	}
	
	
	public int getTitleNo() {
		return this.titleNo; //thisは省略できる
	}
	public void setTitleNo(int titleNo) {
		this.titleNo = titleNo;  //フィールドの名前と引数の名前が同じ場合に区別するためにthisをつける
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

}