//--Lesson23 パッケージを使ってみよう～--

package com.dotinstall.myapp;//パッケージを使う場合は、フォルダ構造・ファイル名を各ファイルに指定しなければならない。
import com.dotinstall.myapp.model.AdminUser;
import com.dotinstall.myapp.model.User;//インポート分を使えば指定したクラスを読み込める。
//import com.dotinstall.myapp.model.*; myapp.model以下のクラスをすべて読み込みたい場合、＊（ワイルドカード）を使う事ですべてのクラスを指定できる。

public class MyApp {

  public static void main(String[] args) {
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
    
//    JapaneseUser Bob = new JapaneseUser();
//    AmericanUser Tom = new AmericanUser();
//    Tom.sayHi();
//    Bob.sayHi();
  }
}