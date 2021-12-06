package Bank;
import java.util.Scanner;

public class infomation {

	public static void main(String[] args) {
		
		drawer dr = new drawer();
		
		System.out.println("ようこそ。後藤銀行メインメニューです。");
		System.out.println("ご希望のお取引を番号でお選びください。");
		System.out.println("1 引き出し, 2 預入, 3 残高確認, 0 終了");
		
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		switch(select){
		
		case 1:
			dr.drawer1();
			break;
//			
		case 2:
//		    deposit();
		    break;
//		    
		case 3:
//			balance();
			break;
			
		default:
			System.out.println("想定外の入力値を感知したため、システムを終了します。");
		}
		sc.close();
		System.out.println("またのご利用お待ちしております。ご利用ありがとうございました。");

	}

}
