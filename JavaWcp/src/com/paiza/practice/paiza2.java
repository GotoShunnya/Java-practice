package com.paiza.practice;

import java.util.Scanner;

public class paiza2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("調べたい文字列を記入してください。");
        String s = sc.next();
        
        System.out.print("含まれているか調べたい１文字を記入してください。");
        String c = sc.next();
        
        int q = s.indexOf(c);
        
        if(q >= 0){
           System.out.println(++q + "文字目に含まれています"); 
        } else if(q == -1){
           System.out.println("含まれていません"); 
        }
        sc.close();

	}

}
