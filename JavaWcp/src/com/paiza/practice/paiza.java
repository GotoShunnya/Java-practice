package com.paiza.practice;

import java.util.Scanner;

public class paiza {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("チャージ金額を設定してください。");
        int money = sc.nextInt();
        System.out.print("利用回数を記入してください。");
        int count = sc.nextInt();
        int balance = 0;
        double point = 0, balancePoint = 0;
        boolean bad = false;
        
        for(int i = 1; i <= count; i++){
           System.out.print("一回の支払金額を記入してください。");
           int pay = sc.nextInt(); 
           
           if(balancePoint >= pay){
               balancePoint -= pay;
           } else if(money >= pay){
               balance = money - pay;
               point = pay * 0.10;
               
               money = balance;
               balancePoint += point;
           } else if(money <= pay){
        	   bad = true;
        	   balance = money - pay;
        	   money = balance;
        	   System.out.println("再チャージしてください");
        	   break;
           }
           
           System.out.println("(残金)" + balance + "円、 (現在のポイント)" + (int)balancePoint + " Point");
        }
        sc.close();
        
        if(bad == true) {
        	System.out.println("残高が足りないため、強制終了します。");
        	System.out.println("(残金)" + balance + "円、 (現在のポイント)" + (int)balancePoint + " Point");
        }
    }
}