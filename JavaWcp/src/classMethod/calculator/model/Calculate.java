package classMethod.calculator.model;

import java.util.Scanner;

public class Calculate {
	double num = 0;
	int counter = 0;
	int division = 0;

	public void calculate() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1つ目の整数を記入: ");
		int number = scanner.nextInt();
		this.num = number;

		Scanner scan = new Scanner(System.in);
		String symbol = " ";

		int count = 0;
		boolean whatSymbol = true;

		do {

			if (count >= 1) {
				System.out.print("前の整数を変化させる整数を記入: ");
				number = scanner.nextInt();

				System.out.print("前の整数を「+,-,*,/,」で処理する。 「+=, -=, *=, /=」で処理して計算を終了する。: ");
				symbol = scanner.next();
			}

			switch (symbol) {
			case "+":
				addNumber(number);
				count++;
				break;

			case "+=":
				addNumber(number);
				whatSymbol = false;
				scanner.close();
				scan.close();
				break;

			case "-":
				minusNumber(number);
				count++;
				break;

			case "-=":
				minusNumber(number);
				whatSymbol = false;
				scanner.close();
				scan.close();
				break;

			case "*":
				timsNumber(number);
				count++;
				break;

			case "*=":
				timsNumber(number);
				whatSymbol = false;
				scanner.close();
				scan.close();
				break;

			case "/":
				divisionNumber(number);
				count++;
				division++;
				break;

			case "/=":
				divisionNumber(number);
				division++;
				whatSymbol = false;
				scanner.close();
				scan.close();
				break;

			case " ":
				count++;
				this.counter++;
				break;

			default:
				System.out.println("演算記号以外記入しないでください。整数・記号を打ち直してください。");
			}
		} while (whatSymbol);
		
			System.out.println("計算結果は　" + Math.floor(this.num * 1000) / 1000);
		
	}

	public double addNumber(int number) {
			this.num += number;
			return this.num;
	}

	public double minusNumber(int number) {
			this.num -= number;
			return this.num;
	}

	public double timsNumber(int number) {
			this.num *= number;
			return this.num;
	}

	public double divisionNumber(int number) {
		this.num /= number;
			return this.num;
	}
}
