package com.dotinstall.myapp.model;//パッケージを使う場合は、フォルダ構造・ファイル名を各ファイルに指定しなければならない。

public class User {
  protected String name;//アクセス修飾子をprotectedに指定。これはこのクラス内と子クラスのみアクセス権が与えられる。※privateは指定したクラスでのみアクセスできる。
  protected int score;
  private static int count = 0;//クラス変数。static修飾子を使うと、クラスに紐づいた形で値を保持できる。

  public User(String name, int score) {//コンストラクタ
    this.name = name;
    this.score = score;
    User.count++;
  }
  
  public static void getInfo() {//クラスメソッド
	  System.out.println("User number " + User.count);
  }

  public void sayHi() {
    System.out.println("hi! " + this.name);
  }
  
  public int getScore() {//geter
	  return this.score;
  }
  
  public void setScore(int score) {//setter
	  if(score > 0) {
		  this.score = score;
	  }
  }
}