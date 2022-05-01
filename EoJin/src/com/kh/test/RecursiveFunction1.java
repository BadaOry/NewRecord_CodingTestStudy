package com.kh.test;

import java.util.Scanner;

public class RecursiveFunction1 {

	// 팩토리얼
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = factorial(num);
		
		System.out.println(result);
		
		
	}
	
	public static int factorial(int num) {
		if(num==0) {
			return 1;
		}else {
			return num * factorial(num-1);
		}
	}

}
