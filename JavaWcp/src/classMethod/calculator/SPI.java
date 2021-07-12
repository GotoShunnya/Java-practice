package classMethod.calculator;

import java.util.Scanner;

public class SPI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int oneMore = 0;

		System.out.print("選んでください　約数、　完全数");
		String calculator = scanner.next();
		
		do {
			if (oneMore >= 1) {
				calculator = scanner.next();
			}
			
		    switch (calculator) {
		
		    case "約数":
			    System.out.println("約数");
			    break;
			
		    case "完全数":
			    System.out.println("完全数");
			    break;
			
		    default:
			    System.out.print("入力したワードは見つかりませんでした。もう一度選んでください。");
			    oneMore++;
			   
		    }
		}while(!calculator.equals("約数"));//2つ以上になるとtrueになりまわり続けてしまう。
		
		scanner.close();
		
	}

}
