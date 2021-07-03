
public class DotInstall {
	public static void main(String[] args) {
		//文字列
		String hello = "Hello World Again";
		System.out.println(hello);
		
		//文字 シングルコーテーションで囲う
		char a = 'a';
		
		//整数　byte < shot < int < long
		int number = 8;
		long BigNumber = 999999999999L;
		
		//浮動少数　flote < double
		double x = 5.5;
		float y = 4.5F;
		
		//論理値　
		boolean flag = true;//false
		
		//文字列
		//改行 /n 
		//タブ /t 
		
		//--Lesson 7--
		int formula = 10 / 3;
		System.out.println(formula);//整数型なので3が出力される
		
		formula++;
		
		System.out.println(formula);
		
		int b = 5;
		
		//b = b + 12;
		b += 12;// 短縮した書き方ができる。
		System.out.println(b);
		
		//b = x; 整数型と浮動小数定数で型が違うのでエラーになる。
		b += (int)x;
		System.out.println(b);//キャストを行うことでdouble型をint型に変換して加算した。
		
		int ten = 10;
		double d = (double)ten / 4;
		System.out.println(d);//　整数型/double型は答が整数になってしまうので、doubleに合わせたキャストする。
		
		//--Lsson8 if文--
		int score = 85;
//		if (score > 80){
//			System.out.println("Great!");
//		} else if(score > 60) {
//			System.out.println("Never give up!");
//		} else {
//			System.out.println("So So...");
//		}
		// > >= < <= == 比較演算子
		// && || ! 論理演算子
		
		String msg = score > 80 ? "Great" : "So So...";
		System.out.println(msg);
		// 条件式 ? 式１ : 式2  条件演算子を用いることでスッキリさせることができる！
		
		//--Lesson9 switch文--
		String signal = "green";
		switch(signal){
		case "red":
			System.out.println("stop!");
		    break;
		
		case "yellow":
			System.out.println("caution!");
			break;
		
		case "blue":
		case "green"://blueかgreenの場合はcaseを並べてあげればOK!
			System.out.println("go!!");
			break;
			
		default://case以外はdefaultで処理させる。
			System.out.println("worng signal!");
			break;
		}
		
		//--Lesson10 while文--
		int c = 100;
//		while(c <10) {
//			System.out.print(c + " ");
//			c++;
//		}
		do {// do while文。判定が後なので一回は必ず処理が行われる
			System.out.println(c + " ");
			c++;
		}while(c <10);
		
		//--Lesson11 for文--
		//breakはループを抜ける。 continueは条件の処理を行わず、次の処理に移る。
		for (int i =0; i < 10; i++) {
			if(i == 5) {
				//break;
				continue;
			}
			System.out.print(i + " ");
		}
		
		//--Lesson12 配列--
		int[] sales = {100, 200, 300};
		
//	    int[] sales;
//		sales = new int[] {100, 200, 300};やり方②
		
//	    sales = new int[3];やり方①
//		sales[0] = 100;
//		sales[1] = 200;
//		sales[2] = 300;
		System.out.println(sales[1]);
		
		sales[1] = 1000;
		System.out.println(sales[1]);
		
		//--Lesson13 配列の要素を操作する--
		int[] sales2 = {300, 500, 700};
		
		//for (int i = 0; i < 3; i++) {
		for (int i = 0; i < sales2.length; i++) {// 配列名.lengthで配列の個数を取得
			System.out.println(sales2[i] + " ");
		}
		
		for (int sale : sales2) {//拡張for文 配列の要素を繰り返し処理するときに使う
			System.out.println(sale);
		}
		
		//--Lesson14 データ型とメモリーの関係--
		//基本データ型（プリミティブ型）と参照型
		  //byte,shot,int,long            String
		  //float,double                  Array (int[])
		  //boolean,char など             Class
		
		//int i = 10;とすると基本データ型の変数には値がそのまま入っている。
		//int[] sales = {100, 200, 300};とすると参照型の変数には、メモリーの番地が入る。
		
		//--Lesson15 基本データ型と参照型を理解しよう--
//		int e = 10;　基本データ型
//		int f = e;
//		f = 5;
//		System.out.println(e);  10
//		System.out.println(f);  5
		
		int[] e = {4, 6, 8};//参照型
		int[] f = e;//配列ｆには配列eのメモリー領域の番地が入る。よって配列fもeと同じデータを参照している。
		f[1] = 19;
		System.out.println(e[1]);
		System.out.println(f[1]);
		
		String s = "hello";// String(参照型だが、、、)
		String t = s;
		t = "world";
		System.out.println(s);
		System.out.println(t);
		//結果が基本データ型と同じ!
		//基本的に文字列の変更は不可になっていて、違う文字列を割り当てると別の領域に新しくデータを確保する仕組みになっているから。
	}
}
