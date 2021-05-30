
public class FizzBuzz {
	public static void main(String[] args) {
	  int i = 0;
	  int counter = 100;
	  int numfizz = 3;
	  int numbuzz = 5;
	  String strfizz = "Fizz";
	  String strbuzz = "Buzz";
	  
	  for (i = 1; i <= counter; i++) {
		  if (i % (numfizz * numbuzz) == 0) {
			  System.out.println(strfizz + strbuzz);
		  }  else if (i % numfizz == 0) {
			  System.out.println(strfizz);
		  }  else if (i % numbuzz == 0) {
			  System.out.println(strbuzz);
		  }  else {
			  System.out.println(i);
		  }
	  }
  }
}
