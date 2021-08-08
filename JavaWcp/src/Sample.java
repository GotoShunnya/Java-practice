import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		
		char a = 'a';
		//char b = "b"; ダブルクォーテーションでくくってしまうと、String扱いになってしまい、コンパイルエラーになってしまう。
		char c = '\u1F1C';//ユニコードを代入
		char d = 100;// 文字コードを代入
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);//char型には、文字１字やユニコード・文字コードを代入できる。
		
		int max = Math.max(6, 57);
		System.out.println("最大値は" + max + "です");

		Scanner scanner = new Scanner(System.in);
		System.out.print("あなたの名前は");
		String name = scanner.next();
		System.out.println("私の名前は" + name + "です");
		scanner.close();// Scannerクラスのインスタンスをクローズ。/

		Calendar cal = Calendar.getInstance();
		System.out.print(cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + "月");
		System.out.println(cal.get(Calendar.DATE) + "日");

		Date date = new Date();
		System.out.println("今日の日付は" + date.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("y/M/d/E");
		System.out.println(sdf.format(date.getTime()));//引数にdate変数を指定

		Random rand = new Random();
		int number = rand.nextInt(6) + 1;//1～6の整数を表示（通常は0～指定された個数の乱数を指定）/
		System.out.println(number);
		switch (number) {
		case 1:
			System.out.println("まだまだだね");
			break;
		case 2:
			System.out.println("足元にも及ばないね");
			break;
		case 3:
			System.out.println("やるじゃん");
			break;
		case 4:
			System.out.println("まあまあだね。。");
			break;
		case 5:
			System.out.println("強いじゃんか");
			break;
		case 6:
			System.out.println("負けたわ。最強");
			break;
		}
		
		ArrayList<String> stateList = new ArrayList<String>();
		stateList.add("TX");//addで項目を追加/
		stateList.add("WA");
		stateList.add("CA");

		for (int i = 0; i < stateList.size(); i++) {
			System.out.println(stateList.get(i));//get関数で引数に取り出したいインデックス番号を指定（今回は配列の要素の文取り出す）
		}

		Collections.sort(stateList);//デフォルトのABC順/
		System.out.println("--- Sorted ---");

		for (int i = 0; i < stateList.size(); i++) {
			System.out.println(stateList.get(i));
		}
		
		for(int i = 10; i >= 1; i--) {//for分のネスト練習/
			for(int j = 1; j <= 10; j++) {
				if( i % 2 == 0 ) {
				}
				else if(j % 2 == 0) {
				}
				else {//奇数だけ表示/
					System.out.println("(" + i + "," + j + ")");
				}
			}
			System.out.println("");
		}
		
		//ラッパークラス練習
		int int1 = 100;
		Integer integer1 = new Integer(int1);
		System.out.println(integer1);
		
		String str1 = "2021";
		int int2 = Integer.parseInt(str1);//parseIntメソッド。ラッパークラスに用意されている。文字列から整数に変換する。
		System.out.println(int2);
		//String int3 = int2; 
		//System.out.println(int3);
		
		Integer integer2 = new Integer("2021");
		double double1 = integer2.doubleValue();//doubleValueメソッド。オブジェクトが持つ値をdouble型で返す。
		System.out.println(double1);
		
	}
}