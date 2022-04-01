package BAECKJOON.step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 01. 2739_구구단
	/*
		N을 입력받은 뒤, 구구단 N단을 출력  
	 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		
		for (int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d\n", n, i, n*i);			
		}
		
	}
}
