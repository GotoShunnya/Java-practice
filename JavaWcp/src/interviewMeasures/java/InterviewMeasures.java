package interviewMeasures.java;

import java.util.ArrayList;//ArrayListとCollectionsライブラリを使うことで、乱数の重複を防ぐ。
import java.util.Collections;
import java.util.Scanner;

public class InterviewMeasures {

	public void interview(){

		System.out.println("面接練習を始めます。");
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 11; i++) {
			list.add(i);//listにaddメソッドを使って数字を入れてゆく。
		}

		Collections.shuffle(list);//listをシャッフル。

		for (int num : list) {//listは配列のため、要素分を変数に移し替えてゆく。

			switch (num) {//変数に移ってきた要素により処理を分ける。
			case 1:
				System.out.println("自己紹介をお願い致します。 完了後は　以上　と記入");
				String completion = scanner.next();
				break;

			case 2:
				System.out.println("自分の長所と短所をお願い致します。 完了後は　以上　と記入");
				completion = scanner.next();
				break;

			case 3:
				System.out.println("エンジニアになりたい理由をお願い致します。 完了後は　以上　と記入");
				completion = scanner.next();
				break;

			case 4:
				System.out.println("志望理由をお願い致します。 完了後は　以上　と記入");
				completion = scanner.next();
				break;

			case 5:
				System.out.println("退職理由をお願い致します。 完了後は　以上　と記入");
				completion = scanner.next();
				break;
				
			case 6:
				System.out.println("今後のキャリアプランをお教えください。 完了後は　以上　と記入");
				completion = scanner.next();
				break;
				
			case 7:
				System.out.println("事業内容は理解しているか？また興味はあるか。 完了後は　以上　と記入");
				completion = scanner.next();
				break;
				
			case 8:
				System.out.println("Salesforceを知っているか 完了後は　以上　と記入");
				completion = scanner.next();
				break;
				
			case 9:
				System.out.println("わからないことに直面した際、どのように乗り越えてきたか 完了後は　以上　と記入");
				completion = scanner.next();
				break;
				
			case 10:
				System.out.println("スクール卒業後はどのように学習しているか。 完了後は　以上　と記入");
				completion = scanner.next();
				break;
				
			case 11:
				System.out.println("当社に関して何か質問はありますか？。 完了後は　以上　と記入");
				completion = scanner.next();
				break;
			}
		}
		System.out.println("面接対策を終了します。");
		scanner.close();
	}

}
