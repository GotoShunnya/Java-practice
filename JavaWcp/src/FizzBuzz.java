import java.util.Random;

public class FizzBuzz {
	public static void main(String[] args) {
		int i = 0;
		int counter = 100;
		int numfizz = 3;
		int numbuzz = 5;
		String strfizz = "Fizz";
		String strbuzz = "Buzz";

		for (i = 1; i <= counter; i++) {
			Random rand = new Random();
			int randnum = rand.nextInt(100) + 1;//変数randnumも100回繰り返す。/
			if (randnum % (numfizz * numbuzz) == 0) {
				System.out.println(strfizz + strbuzz);
			} else if (randnum % numfizz == 0) {
				System.out.println(strfizz);
			} else if (randnum % numbuzz == 0) {
				System.out.println(strbuzz);
			} else {
				System.out.println(randnum);
			}
		}
	}
}
