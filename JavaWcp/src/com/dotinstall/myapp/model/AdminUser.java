package com.dotinstall.myapp.model;//パッケージを使う場合は、フォルダ構造・ファイル名を各ファイルに指定しなければならない。

public class AdminUser extends User {

  public AdminUser(String name) {
    super(name);
  }

  public void sayHello() {
    System.out.println("hello! " + this.name);
  }

  @Override
  public void sayHi() {
    System.out.println("[admin] hi! " + this.name);
  }
}