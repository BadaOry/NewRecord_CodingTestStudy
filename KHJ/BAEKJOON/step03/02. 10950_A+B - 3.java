package BAECKJOON.step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 02. 10950_A+B - 3
	/*
		두 정수 A와 B를 입력받은 다음, A+B를 출력
 		  1. 첫째 줄에 테스트 케이스의 개수 T 입력
 		  2. A와 B 입력
	 */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		
		for (int i = 1; i <= T; i++) {			
			int A = sc.nextInt(); 
			int B = sc.nextInt(); 
			
			System.out.println(A+B);
			
		}
		
	}
}
