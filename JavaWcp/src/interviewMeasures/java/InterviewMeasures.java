package interviewMeasures.java;

import java.util.ArrayList;//ArrayListとCollectionsライブラリを使うことで、乱数の重複を防ぐ。
import java.util.Collections;
import java.util.Scanner;

public class InterviewMeasures {

	public static void main(String[] args) {

		System.out.println("面接練習を始めます。");
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 5; i++) {
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
			}
		}
		System.out.println("面接対策を終了します。");
		scanner.close();
	}

}
