package com.dotinstall.myapp.model;//パッケージを使う場合は、フォルダ構造・ファイル名を各ファイルに指定しなければならない。

public class User {
  protected String name;//アクセス修飾子をprotectedに指定。これはこのクラス内と子クラスのみアクセス権が与えられる。※privateは指定したクラスでのみアクセスできる。

  public User(String name) {
    this.name = name;
  }

  public void sayHi() {
    System.out.println("hi! " + this.name);
  }
}