package classMethod.calculator;

import java.util.Scanner;

import classMethod.calculator.model.Divisor;
import classMethod.calculator.model.PerfectNumber;

public class SPI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Divisor divisor = new Divisor();
		PerfectNumber perfectNumber = new PerfectNumber();

		System.out.println("選んでください　約数、　完全数");
		String calculator = scanner.next();
		boolean oneMore;

		if (calculator.equals("約数")) {
			oneMore = false;
		} else if (calculator.equals("完全数")) {
			oneMore = false;
		} else {
			oneMore = true;
		}

		do {

			switch (calculator) {

			case "約数":
				divisor.divisor();
				break;

			case "完全数":
				perfectNumber.perfectNumber();
				break;
			}

			if (calculator.equals("約数")) {
				scanner.close();
				oneMore = false;
			} else if (calculator.equals("完全数")) {
				scanner.close();
				oneMore = false;
			} else {
				System.out.print("入力したワードは見つかりませんでした。もう一度選んでください。");
				calculator = scanner.next();
			}
		} while (oneMore);

	}

}
