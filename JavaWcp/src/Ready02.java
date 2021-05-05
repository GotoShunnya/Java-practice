
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

		//----------------------------------------------------------------------------------

		int[] array1 = new int[5]; //「配列」
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		array1[4] = 5;

		System.out.println(array1[3]);

		int[] array3 = new int[] { 55, 1, 2, 3, 4 }; //上を省略した形
		System.out.println(array3[0]);

		int val = 2 + 5; //-----------------------------------------------------------------
		val++; //インクリメント（処理の後に数値を１増加させる）。1減らすのはデクリメント
		val *= 5;// valに5掛ける
		System.out.println(val);

		boolean bool = (val == 50); //valは50と等しいという比較
		System.out.println(bool);

		bool = (val < 50) && (val % 10 == 0); //valは50より小さく、且つ10で割った数が0と等しい
		System.out.println(bool);

		//-----------------------------------------------------------------------------------

		int distance = 4;

		if (distance <= 5) { //変数の値が5以下の時
			System.out.println("とても近いです");
		}

		else if (distance <= 10) { //変数の値が5以上10以下の時
			System.out.println("近いです");
		}

		else if (distance <= 15) { //変数の値が10以上15以下の時
			System.out.println("遠いです");
		}

		else { //値が15以上の時
			System.out.println("とても遠いです");
		}

		//---------------------------------------------------------------------------------------
		String signal = "blue"; //文字列でblueの時
		switch (signal) { //変数の値を条件にして分岐をする制御文(switch)

		case "red": //変数とcaseの値が一致するとき処理を実行
			System.out.println("赤信号です");

		case "yellow":
			System.out.println("黄信号です");

		case "blue":
			System.out.println("青信号です");
			break; //break文でそれ以降のcaseは評価せず、switch文を終了する。

		default:// すべてのcaseと一致しない場合、default内の処理が実行される。（必須ではない）
			System.out.println("信号の色ではありません");
		}

		//----------------------------------------------------------------------------------
		int number = 1;
		while (number < 5) { //1以上5未満の時
			System.out.println(number * number); //要素を2乗したものを出力する。
			number++;// 要素を処理後に+1する（インクリメント）
		}

		int[] array4 = { 1, 2, 3, 4, }; //配列の初期値を設定
		for (int num : array4) { //配列の要素を順番に変数numに代入し、要素分繰り返す
			System.out.println("For02 =" + num);
		}

		int array5[] = { 1, 4, 14, 25 }; //模範回答 
		for (int i = 0; i < array5.length; i++) { //変数iを初期値0にして、インクリメントで足していきながら、配列array5のサイズ分ループ処理を行う。
			System.out.println(array5[i]); //要素を配列のサイズ分出力
		}

		int[] array6 = { 3, 4, 8, 9 };
		for (int num2 : array6) {
			if (num2 % 2 == 0) { //num2が偶数の場合、
				continue; //その後の処理（System.out.println）をスキップ
			}
				System.out.println(num2);
		}

		//-----------------------------------------
	}
}
