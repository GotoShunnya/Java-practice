
public class Ready02 { //クラスブロック開始
	public static void main(String[] args) { //メソッドブロック開始
		System.out.println("Hello World"); //System.out.printlnで出力。
		System.out.println("Hello Java");

		String str1; //型と変数を宣言
		str1 = "GotoSyunya"; //変数の中身
		System.out.println(str1);

		str1 = "sushi"; //再代入の際は型はもう指定しない
		System.out.println(str1);

		final int NUMBER = 8; //定数はfinalで宣言
		System.out.println(NUMBER);

		long long1 = 888888888L; //defaultがintなので、longの場合は一番最後に"L"をつける
		System.out.println(long1);

		double double1 = 8.3; //浮動小数型
		System.out.println(double1);

		boolean boolean1 = false; //tureとfalseの2種
		System.out.println(boolean1);

		Float Float1 = 3.8F; //defaultがdoubleなので最後に"F"をつける。「ラッパークラス」
		System.out.println(Float1);

		Integer Integer1 = 83; //「ラッパークラス」
		System.out.println(Integer1);

		Character Character1 = 'a'; //「文字型」
		System.out.println(Character1);

		int[] array1 = new int[5]; //「配列」
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		array1[4] = 5;

		System.out.println(array1[3]);

		int[] array3 = new int[] { 55, 1, 2, 3, 4 }; //上を省略した形
		System.out.println(array3[0]);

		int val = 2 + 5; //出力結果一緒に出ちゃう（汗）
		val++; //インクリメント（処理の後に数値を１増加させる）。1減らすのはデクリメント
		val *= 5;// valに5掛ける
		System.out.println(val);
		
		boolean bool = (val == 50); //valは50と等しいという比較
		System.out.println(bool);
		
		bool = (val < 50) && (val % 10 == 0); //valは50より小さく、且つ10で割った数が0と等しい
		System.out.println(bool);

	}
}
