package BAECKJOON.step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 7. 2480_주사위 세개
	/*
		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
	 */
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt();
		
		int reward = 0;
	
		if(A == B && B == C) {
			reward = 10000 + A*1000;
			System.out.println(reward);
		} else if (A == B || B == C || A == C) {
			if(A == B || A == C) {
				reward = 1000 + A*100;
				System.out.println(reward);
			} else if(A == B || B == C) {
				reward = 1000 + B*100;
				System.out.println(reward);
			} else {
				reward = 1000 + C*100;
				System.out.println(reward);
			}
		} else {
			
			if(A > B && A > C) {
				reward = A*100;
				System.out.println(reward);
			} else if(B > A && B > C) {
				reward = B*100;
				System.out.println(reward);
			} else {
				reward = C*100;
				System.out.println(reward);
			}
			
		}
		
		
	}
}
