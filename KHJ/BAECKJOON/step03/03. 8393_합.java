package BAECKJOON.step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 03. 8393_합
	/*
		n이 주어졌을 때, 1부터 n까지 합구하기
	 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int result = 0;
		
		for (int i = 1; i <= n; i++) {			 
			
			result = result + i;			
			
		}		
		System.out.println(result);		
	}
}
