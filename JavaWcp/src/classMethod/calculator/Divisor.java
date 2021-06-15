package classMethod.calculator;//約数検出プログラム/

import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("約数を調べたい整数を記入: ");
		int num = scanner.nextInt();

		System.out.println(num + "の約数の数は" + isDivisor(num) + "個です");//isDivisorメソッドの呼び出し/
		System.out.println(num + "の約数の総和は" + all(num) + "です");//allメソッドの呼び出し/
		scanner.close();
	}

	static int isDivisor(int num) {//メソッド定義/
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {//記入した整数を1から割っていき、余りが0の時(約数)/
				System.out.print(i + ", ");//約数の表示/
				count++;//約数の数をカウント/
			}
		}
		System.out.println();
		return count;
	}
	
	static int all(int num) {//メソッド定義/
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				sum += i;//約数をsumに入れて加算/
			}
		}
		return sum;
	}
}
