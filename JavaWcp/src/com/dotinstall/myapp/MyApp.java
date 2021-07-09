//--Lesson23 パッケージを使ってみよう--

package com.dotinstall.myapp;//パッケージを使う場合は、フォルダ構造・ファイル名を各ファイルに指定しなければならない。
import com.dotinstall.myapp.model.User;//インポート分を使えば指定したクラスを読み込める。
import com.dotinstall.myapp.model.AdminUser;
//import com.dotinstall.myapp.model.*; myapp.model以下のクラスをすべて読み込みたい場合、＊（ワイルドカード）を使う事ですべてのクラスを指定できる。

public class MyApp {

  public static void main(String[] args) {
    User tom = new User("tom");
    //System.out.println(tom.name); 今回nameフィールドはアクセス修飾子にprotectedを使っているため、MyAppから直接アクセスできない。
    tom.sayHi();

    AdminUser bob = new AdminUser("bob");
    //System.out.println(bob.name);
    bob.sayHi();
    bob.sayHello();
  }

}