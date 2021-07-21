package classMethod.calculator;

import java.util.Scanner;

import classMethod.calculator.model.Average;
import classMethod.calculator.model.Calculate;
import classMethod.calculator.model.Divisor;
import classMethod.calculator.model.PerfectNumber;

public class SPI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Divisor divisor = new Divisor();
		PerfectNumber perfectNumber = new PerfectNumber();
		Calculate calculate = new Calculate();
		Average average = new Average();

		System.out.println("選んでください　約数、　完全数、　四則演算　平均");
		String calculator = scanner.next();
		boolean oneMore = true;

		do {

			switch (calculator) {

			case "約数":
				divisor.divisor();
				break;

			case "完全数":
				perfectNumber.perfectNumber();
				break;
				
			case "四則演算":
				calculate.calculate();
				break;
				
			case "平均":
				average .average();
				break;
			}
			
			if (calculator.equals("約数")) {
				scanner.close();
				oneMore = false;
			} else if (calculator.equals("完全数")) {
				scanner.close();
				oneMore = false;
			} else if (calculator.equals("四則演算")) {
				scanner.close();
				oneMore = false;
			} else if (calculator.equals("平均")) {
				scanner.close();
				oneMore = false;
			} else {
				System.out.print("入力したワードは見つかりませんでした。もう一度選んでください。");
				calculator = scanner.next();
			}
		} while (oneMore);

	}

}