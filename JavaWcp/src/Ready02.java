
public class Ready02 { //クラスブロック開始
	public static void main(String[] args) { //メソッドブロック開始
	  System.out.println("Hello World"); //System.out.printlnで出力。
	  System.out.println("Hello Java");
	  
	  String str1; //型と変数を宣言
	  str1 = "GotoSyunya"; //変数の中身
	  System.out.println(str1);
	  
	  str1 = "sushi"; //再代入の際は型はもう指定しない
	  System.out.println(str1);
	  
	  final int NUMBER = 8; //定数はfinalで宣言
	  System.out.println(NUMBER);
	  
	  long long1 = 888888888L;
	  System.out.println(long1);
	  
	  double double1 = 8.3;
	  System.out.println(double1);
	  
	  boolean boolean1 = false;
	  System.out.println(boolean1);
	  
	  Float Float1 = 3.8F;
	  System.out.println(Float1);
	  
	  Integer Integer1 = 83;
	  System.out.println(Integer1);
	  
	  Character Character1 = 'a';
	  System.out.println(Character1);
	  
	  int[] array1 = new int[5];
	  array1[0] = 1;
	  array1[1] = 2;
	  array1[2] = 3;
	  array1[3] = 4;
	  array1[4] = 5;
	  
	  System.out.println(array1[3]);
	  
	  int[] array3 = { 55, 1, 2, 3, 4 };
	  System.out.println(array3[0]);
  }
}
