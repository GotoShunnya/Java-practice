import java.util.Random;
import java.util.Scanner;

class MyApp {
  public static void main(String[] args) {
    int ten = 10;
    System.out.println("数当てゲーム（上限は " + ten + " 回）");
    Integer answer = new Random().nextInt(30) + 1;
    Integer count = 0;
    
     for (int i = 1; i <= 10; i++) {
      System.out.print("Your guess? ");
      Integer guess = new Scanner(System.in).nextInt();
      count++;
      
      if (answer == guess) {
        System.out.println("Bingo! It took " + count + " guessness!");
        break;
      } else if (answer > guess ) {
        System.out.println("The answer is higher!");
      } else {
        System.out.println("The answer is lower!");
      } 
    }
    if (count == 10){
      System.out.println("挑戦回数が上限の " + ten + "回を超えました");
    }
  }
}