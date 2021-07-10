//--Lesson23 パッケージを使ってみよう～--

package com.dotinstall.myapp;//パッケージを使う場合は、フォルダ構造・ファイル名を各ファイルに指定しなければならない。
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.User;//インポート分を使えば指定したクラスを読み込める。

public class MyApp {

  public static void main(String[] args) {
	
	Print P = new Print();
	P.print();
	P.getInfo();
	
	Result res;//列挙型変数定義。
	res = Result.SUCCESS;//	列挙型に定義されている定数SUCCESSをresに代入
	switch (res){
	  case SUCCESS:
		  System.out.println("OK!");
		  break;
		  
	  case ERROR:
		  System.out.println("NG!");
		  break;
	}
	
	User.getInfo();//0
	  
    User tom = new User("tom", 65);
    tom.setScore(85);//setter呼び出し
    tom.setScore(-67);
    System.out.println(tom.getScore());//getter呼び出し
    //System.out.println(tom.name); 今回nameフィールドはアクセス修飾子にprotectedを使っているため、MyAppから直接アクセスできない。
    tom.sayHi();
    
    User.getInfo();//1
    
    AdminUser bob = new AdminUser("bob", 65);
    System.out.println(bob.getAdminScore());
    //System.out.println(bob.name); 今回nameフィールドはアクセス修飾子にprotectedを使っているため、MyAppから直接アクセスできない。
    bob.sayHi();
    bob.sayHello();
    
    JapaneseUser taka = new JapaneseUser();
    AmericanUser mone = new AmericanUser();
    taka.sayHi();
    mone.sayHi();
  }
}

interface printable{
	double VERSION = 1.1;//定数
	void print();//抽象メソッド
	public default void getInfo() {//defaultメソッド。直接実装が書けるメソッド。
		System.out.println("I/F ver. " + printable.VERSION);
	}
	//staticメソッド。defaultメソッドが複雑化した時のヘルパーとして使われていることが多い。
}

class Print implements printable{
	public void print(){
	  System.out.println("Now printing user profile...");
	}
}

abstract class Abstract{//抽象クラス
	public abstract void sayHi();//抽象メソッド。
}

class JapaneseUser extends Abstract{
	@Override
	public void sayHi() {
		System.out.println("こんにちは！");
	}
}

class AmericanUser extends Abstract{
	@Override
	public void sayHi() {
		System.out.println("HI！");
	}
}

enum Result{//列挙型。定数をまとめたもの。
	SUCCESS,//0   res.ordinalでオーディナル番号を取得できる。
	ERROR,//1
}