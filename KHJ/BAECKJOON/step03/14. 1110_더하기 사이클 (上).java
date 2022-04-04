package BAECKJOON.step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 14. 1110_더하기 사이클 上
	/*
	 	시간 제한 : 2초
	 	1. 먼저 주어진 수(N)가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만든다
	 	2. 먼저 주어진 수(N)의 각 자리의 숫자를 더한다(p).
	 	3. 주어진 수(N)의 가장 오른쪽 자리 수(T의 십의 자릿수)와
	 	   앞에서 구한 합의 가장 오른쪽 자리 수(T의 일의 자릿수)를 이어 붙인다.
	 	=> 위 방식을 반복하였을 때 다시 먼저 주어진 수(N)로 돌아오기 까지의 반복횟수를 구해라
	 	
	 	★ 알고리즘적 접근 필요 ★
	 		(참고 : https://st-lab.tistory.com/42)
	 		
	 	주어진 수 : N
	 	새로운 수 : T
	 		T의 십의 자릿수 : (N%10) * 10 
	 					   = N의 가장 오른쪽 자리 값 => T의 십의 자릿값
	 					   
	 		T의 일의 자릿수 : ((N/10) + (N%10)) % 10
	 					   = 각 자릿수의 합
	 		 			   = (N의 십의 자릿수 + N의 일의 자릿수) % 10
	 					   = N의 자릿수의 합 중 일의 자릿수
	 		
	 		∴ T = 십의 자릿수 + 일의 자릿수
	 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;	// 사이클 횟수
		int copy = N;	// 처음 입력값을 기억하기 위한 변수
		
		// 적어도 1회 반복해야하므로 do-while문 사용
		do {
			N = ((N % 10) * 10) + (((N/10) + (N%10))%10);
			cnt++;
		} while (copy != N);
		
		System.out.println(cnt);
		
		
		 
		
		
		
		
	}
}
