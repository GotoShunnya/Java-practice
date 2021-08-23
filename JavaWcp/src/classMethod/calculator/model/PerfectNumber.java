package classMethod.calculator.model;

import java.util.Scanner;

public class PerfectNumber {
	public void perfectNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("完全数か判断したい整数を記入してください:");
		int num = scanner.nextInt();
		
		if (isPerfectNumber(num)) {
			System.out.println(num + "は完全数です。");
		} else {
			System.out.println(num + "は完全数ではありません");
		}
		scanner.close();
	}
	
	private boolean isPerfectNumber(int num) {
		int sum = 0;
		for(int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + ",");
				sum += i;
			}
		}
		
		System.out.println("(約数)");
		System.out.println(sum +  "(自身の数を除いた約数の和)");
		
		if (sum == num) {
			return true;
		} else {
			return false;
		}
	}
}