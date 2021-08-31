package com.paiza.practice;

import java.util.Scanner;

public class D {
	String onOff;
	
	D(){
		onOff = "OFF";
	}
	    
	    public static void main(String[] args) {
	        // 自分の得意な言語で
	        // Let's チャレンジ！！
	        Scanner sc = new Scanner(System.in);
	        int count = sc.nextInt();
	        
	        D d = new D();
	        
	        if(count % 2 == 0){
	            d.printOff(d.onOff);
	        } else {
	            d.printOn();
	        }
	        sc.close();
        }
	    
	    private void printOff(String i) {
	    	System.out.println(i);
	    }
	    
	    private void printOn() {
	        this.onOff = "ON";
	        System.out.println(this.onOff);
	    }
}
