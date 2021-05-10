package classMethod.action;

import classMethod.MyFanction.MyFanction02;

	public class action01 {
	    public static void main(String[] args) {
	        MyFanction02 yamada = new MyFanction02();  //MyFanction02クラスのインスタンスを生成
	        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

	        MyFanction02 sato = new MyFanction02("佐藤", 25); //MyFanction02クラスのインスタンスを生成
	        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	        
	    }
	}