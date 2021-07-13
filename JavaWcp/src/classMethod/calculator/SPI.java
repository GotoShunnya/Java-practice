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
		
			
		    switch (calculator) {
		
		    case "約数":
			    divisor.divisor();
			    break;
			
		    case "完全数":
		    	perfectNumber.perfectNumber();
			    break;
			
		    default:
			    System.out.print("入力したワードは見つかりませんでした。もう一度選んでください。");
			   
		    }
		scanner.close();
		
	}

}
