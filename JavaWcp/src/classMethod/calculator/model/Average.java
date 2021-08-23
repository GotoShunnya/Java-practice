package classMethod.calculator.model;

import java.util.Scanner;

public class Average {
	
	boolean end;
	
	public Average(){//コンストラクタ
		this.end = true;
	}
	
	public void getAverage() {
		average();
	}

	private void average() {
		
		int count = 0;
		int i = 1;
		int plus = 0;
		int sum = 0;
		double ave = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("整数を記入: ");
		int num = scanner.nextInt();
		
		do {
			int[] number = new int[i];
			
			if (count >= 1) {
				System.out.println("整数を記入(終了は\" 00 \") ");
				num = scanner.nextInt();
			}
			
			if (num == 00) {
				number = null;//配列にnullを入れることで、ガベージコレクションの対象になる。使い終わった配列はnullを入れてガベージコレクションの対象にすることでメモリーの後片付けを行える。
				ave = (double)sum / count;
				this.end = false;
				scanner.close();
				
			} else {
			    number[plus] = num;
			    sum += number[plus];
			    i++;
			    plus++;
			    count++;
			}
		}while(this.end);
		System.out.println("合計は " + sum);
		System.out.println("平均は " + (Math.floor(ave * 10) / 10));//Math.floorは小数点を切り捨てる。
		//先に値を10倍し、小数点を切り捨てる。その後、10で割ることで小数点第一位で切り捨てることができる。
	}
}
