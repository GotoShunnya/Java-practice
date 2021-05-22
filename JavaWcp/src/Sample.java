import java.util.Scanner;

public class Sample {
    public static void main(String []args) {
    	int max = Math.max(6, 57);
    	System.out.println("最大値は" + max + "です");
    	
    	
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("あなたの名前は");
    	String name = scanner.next();
    	System.out.println("私の名前は" + name + "です");
    	scanner.close();
    }
  }