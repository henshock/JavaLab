package io;

import java.util.Scanner;

public class TestScaner {//Thread:執行緒

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入選項: 1. AAA 2. BBB");
		
		String answer = scanner.nextLine();//使用者如果沒有按enter,會一直等,卡著不動
		System.out.println("你輸入的是:"+answer);
		
		

	}

}
