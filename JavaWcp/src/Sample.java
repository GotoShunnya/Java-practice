import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
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
			stateList.add("TX");
			stateList.add("WA");
			stateList.add("CA");

			for(int i=0;i<stateList.size();i++){
				System.out.println(stateList.get(i));
			}

			Collections.sort(stateList);
			System.out.println("--- Sorted ---");

			for(int i=0;i<stateList.size();i++){
				System.out.println(stateList.get(i));
		}
	}
}