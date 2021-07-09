package com.dotinstall.myapp.model;//パッケージを使う場合は、フォルダ構造・ファイル名を各ファイルに指定しなければならない。

public class User {
  protected String name;//アクセス修飾子をprotectedに指定。これはこのクラス内と子クラスのみアクセス権が与えられる。※privateは指定したクラスでのみアクセスできる。
  protected int score;
  private static int count;//クラス変数。static修飾子を使うと、クラスに紐づいた形で値を保持できる。
  private static final double VERSION = 1.1;//finalは定数の宣言。基本的に定数名はすべて大文字。値を変更できない。またクラスに付与すると継承できなくなり、メソッドにつけるとオーバーライドできなくなることに注意。
                                              //またフィールドには、staticと合わせて使われることがある。

  static {//staticイニシャライザ
	  User.count = 0;//クラス変数が配列などで複数のデータを初期化する場合に用いられる。
	  System.out.println("Static initializer");
  }
  
  {//インスタンスイニシャライザ。インスタンス化される前に処理が行われる。
	  System.out.println("Instance initializer");
  }
  
  public User(String name, int score) {//コンストラクタ。こっちは、インスタンス化後に処理が行われる。
    this.name = name;
    this.score = score;
    User.count++;
	System.out.println("Constructer");
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