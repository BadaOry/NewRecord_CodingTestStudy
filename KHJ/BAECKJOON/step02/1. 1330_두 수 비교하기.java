package BAECKJOON.step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 1. 1330_두 수 비교하기
/*
	A가 B보다 큰 경우에는 '>'를 출력한다.
	A가 B보다 작은 경우에는 '<'를 출력한다.
	A와 B가 같은 경우에는 '=='를 출력한다.	
 */
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println(">");
		} else if(A < B) {
			System.out.println("<");
		} else if(A == B) {
			System.out.println("==");
		}
		
	}
}
